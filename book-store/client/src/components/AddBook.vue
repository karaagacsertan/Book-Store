<template>
  <div class="submit-form">
    <div>
      <div class="form-group">
        <label for="title">Title</label>
        <input
          type="text"
          class="form-control"
          id="title"
          required
          v-model="book.title"
          name="title"
        />
      </div>

      <div class="form-group">
        <label for="author">Author</label>
        <input
          class="form-control"
          id="author"
          required
          v-model="book.author"
          name="author"
        />
      </div>
      <div class="form-group">
        <label for="genre">Genre</label>
        <input
          class="form-control"
          id="genre"
          required
          v-model="book.genre"
          name="genre"
        />
      </div>
      <div class="form-group">
        <label for="price">Isbn</label>
        <input
          class="form-control"
          id="isbn"
          required
          v-model="book.isbn"
          name="isbn"
        />
      </div>
      <div class="form-group">
        <label for="language">Language</label>
        <input
          class="form-control"
          id="language"
          required
          v-model="book.language"
          name="language"
        />
      </div>
      <div class="form-group">
        <label for="price">Price</label>
        <input
          class="form-control"
          id="price"
          required
          v-model="book.price"
          name="price"
        />
      </div>

      <button @click="saveBook" class="btn btn-success">Add</button>
    </div>

   
  </div>
</template>

<script>
import BookService from "../service/BookService";
export default {
  name: "Books",
  data() {
    return {
      book: {
        id: null,
        title: "",
        author: "",
        genre: "",
        isbn: null,
        language: "",
        price: null,
      },
    };
  },
  methods: {
    saveBook() {
      var data = {
        title: this.book.title,
        author: this.book.author,
        genre: this.book.genre,
        isbn: this.book.isbn,
        language: this.book.language,
        price: this.book.price,
      };
      BookService.addBook(data).toUpperCase()
        .then(response => 
          this.book.id = response.data.id,
         // this.submitted = false;
        )
        .catch((err) => console.log(err));

        alert("Added")
    },
    
  },
};
</script>
<style>
.submit-form {
  max-width: 300px;
  margin: auto;
}
</style>
