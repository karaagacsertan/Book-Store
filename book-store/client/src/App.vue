<template>
  <!-- <div><BooksList/></div> -->

  <!-- <div class="vue-template"> -->
    <!-- <BooksList /> -->
    <!-- <AddBook/> -->
    <!-- Main -->
    <!-- <div class="App">
      <div class="vertical-center"> -->
        <!-- <div>

 
          <router-view />
        </div> -->
      <!-- </div>
    </div>
  </div> -->
<div id="app">
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="container-fluid">
        <a class="navbar-brand" href="/">Bookstore</a>
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <router-link class="nav-link active" aria-current="page" to="/"
                >Home</router-link
              >
            </li>
            <li class="nav-item">
              <router-link class="nav-link" to="/list"
                >Book List</router-link
              >
            </li>
            <li class="nav-item">
              <router-link class="nav-link" to="/add"
                >Add List</router-link
              >
            </li>
          </ul>
          
        </div>
      </div>
    </nav>
    <router-view />
   
    </div>
 
</template>



<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
 
}
#nav {
  padding: 30px;
}
#nav a {
  font-weight: bold;
  color: #2c3e50;
}
#nav a.router-link-exact-active {
  color: #42b983;
}


</style>