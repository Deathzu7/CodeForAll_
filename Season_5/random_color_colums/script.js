


function randomcolor(box = null) {
  // Se uma caixa foi passada, muda apenas essa
  if (box) {
      const color = Math.floor(Math.random() * 16777215).toString(16);
      box.style.background = `#${color}`;
      const p = box.querySelector("p");
      p.textContent = `#${color}`;
  } else {
      // Gera cores aleatórias para todas as barras ao carregar
      for (let index = 1; index < 6; index++) {
          const bar = document.getElementById(index);
          const color = Math.floor(Math.random() * 16777215).toString(16);
          bar.style.background = `#${color}`;
          const p = document.getElementById(`p${index}`);
          p.textContent = `#${color}`;
      }
  }
}
randomcolor()



document.querySelector(".container").addEventListener("click", (event) => {
  if (event.target.classList.contains("color-bar")) {
      randomcolor(event.target); 
      console.log(event.target, "clicked na tua cara") // Passa a caixa clicada para a função
  }
});


/*
window.addEventListener("load", () => {
  
  const box = document.querySelectorAll(".container");
  child.addEventListener("click", () => {
    console.log("clicked");
    randomcolor()
 
})
})
*/