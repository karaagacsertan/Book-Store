<template>
  <div class="home">
    <br />
 
    <br />
    <img src="../assets/book-image.jpeg" width="500" height="500" alt="Book-Photo"/>
    <br />
    <br />
    <br />
    <br />
    <br />
    <div class="card text-white bg-success mb-3" style="max-width: 300rem">
      <div class="card-header">&#128204; Sentence Of The Day</div>
      <div class="card-body">
     
         {{cumle.Sentence}}
      </div>
    </div>
    <br />
    <br />
  </div>
</template>

<script>


import Sentences from "./Sentences.json";
export default {
  name: "Home",
 
  data() {
    return {
      myJson: Sentences,
      cumle: null
    };
  },
  mounted(){
    this.cumle= this.myJson.Sentences[Math.floor(Math.random()*this.myJson.Sentences.length)];
  }
};
</script>