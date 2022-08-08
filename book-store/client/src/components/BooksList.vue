<template>
<div class="container">
  <div class="row">
    <div class="col-lg-12">
      <table id="example" class="display" style="width:100%">
        <thead>
            <tr>
                <th>Title</th>
                <th>Author</th>
                <th>Cover Photo Url</th>
                <th>ISBN Number</th>
                <th>Price </th>
                <th>Language</th>
                <th>Genre</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
        
            <tr v-for="book in books" v-bind:key="book.id">
                
                <td>{{book.title}}</td>
                <td>{{book.author}}</td>
                <td>{{book.coverPhotoURL}}</td>
                <td>{{book.isbnNumber}}</td>
                <td>{{book.price}}</td>
                <td>{{book.language}}</td>
                <td>{{book.genre}}</td>
                <td><button type="button" class="btn " ><i class="fas fa-edit" style="color:#28a745" ></i></button>
                <button type="button" class="btn "
                @click="deleteById(book.id)"
                ><i class="far fa-trash-alt" style="color:#dc3545"></i></button></td>
            </tr>
        </tbody>
    </table>
    </div>
  </div>
</div>

</template>



<script>
import BookService from "../service/BookService"


export default {
  name: 'Book',
 
     data(){
         return {
            
             books:[]
        
            
         }
    },
    methods: {
        getAllBooks(){
            BookService.getAllBooks().then((response) => {
                this.books = {...response.data};   
               
            });
        },
        deleteById(id){
            BookService.deleteBook(id).then(response => {
                console.log(response)
            });

          
            
    }

     
    },
        mounted() {
            this.getAllBooks();
        
    },
       
      
}
</script>

