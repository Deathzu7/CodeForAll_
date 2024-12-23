import { routes } from './routes.js';

function handlePopState({ state }) {
    const route = state || routes.home;
    setCurrentRoute(route);
    loadController(route.controller);
}

async function loadController(controllerName) {
    try {
        const module = await import(`./controller/${controllerName}.js`);
        module.init();
    } catch (err) {
        console.error('Error loading controller:', err);
    }
}

function setCurrentRoute(route) {
    const { path, controller } = route;
    routes.currentPath.path = path;
    routes.currentPath.controller = controller;
}

function navigate(path, firstLoad = false) {
    const routeKey = Object.keys(routes).find(key => routes[key].path === path);
    const route = routes[routeKey] || routes.home;
    setCurrentRoute(route);

    firstLoad
        ? history.replaceState(route, '', route.path)
        : history.pushState(route, '', route.path);

    loadController(route.controller);
}

function addEventsToAnchors() {
    const anchors = document.querySelectorAll('a');
    anchors.forEach(anchor =>
        anchor.addEventListener('click', function (event) {
            event.preventDefault();
            navigate(anchor.getAttribute('href'));
        })
    );
}

function init() {
    const path = window.location.pathname;
    navigate(path, true);
    window.addEventListener('popstate', handlePopState);
    addEventsToAnchors();
}

export default { init };
