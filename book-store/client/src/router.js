import Vue from "vue";
import Router from "vue-router";
import AddBook from "./components/AddBook"
import BooksList from "./components/BooksList"
import Home from "./components/Home"

Vue.use(Router);
export default new Router({
  mode: "history",
  routes: [
    {
      path:"/",
      name:"home",
      component: Home
    },
    {
      path: "/list",
      name: "list",
      component: BooksList
    },
    {
      path:"/add",
      name: "add",
      component: AddBook
    }



  ]
});
