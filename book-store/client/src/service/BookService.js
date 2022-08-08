import axios from "axios";

const BASE_URL = "http://localhost:8080/api/v1";


class BookService {
   getAllBooks() {
      return axios.get(`${BASE_URL}/get`);
   }
   deleteBook(id) {
      return axios.delete(`${BASE_URL}/delete/${id}`)
   }
   addBook(data){
      return axios.post(BASE_URL+"/add/",data)
   }


}
export default new BookService()

