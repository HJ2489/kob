<template>
  <NavBar/>
  <router-view/>
</template>

<script>
import NavBar from "./components/NavBar.vue"
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
import $ from "jquery";

export default {
  components: {
    NavBar,
  },
  setup() {
    $.ajax({
      url: "http://127.0.0.1:3000/user/account/token/",
      type: "post",
      data: {
        username: 'hj',
        password: 'phj',
      },
      success(resp) {
        console.log(resp);
      },
      error(resp) {
        console.log(resp);
      }
    });

    $.ajax({
      url: "http://127.0.0.1:3000/user/account/info/",
      type: "get",
      headers: {
        Authorization: "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI1ZTQ1Njk1MDkwYjE0MGIwOTVhZTBkYWQzMmFkZjMwYiIsInN1YiI6IjEiLCJpc3MiOiJzZyIsImlhdCI6MTcwMTk1MzIzNywiZXhwIjoxNzAzMTYyODM3fQ._RI9BqD6CLmOPxcyNfzzbhwNlBpPdg3CJ5svl-4ZyIY"
      },
      success(resp) {
        console.log(resp);
      },
      error(resp) {
        console.log(resp);
      }
    });

    $.ajax({
      url: "http://127.0.0.1:3000/user/account/register/",
      type: "post",
      data: {
        username: "hj1",
        password: "123",
        confirmedPassword: "123",
      },
      success(resp) {
        console.log(resp);
      },
      error(resp) {
        console.log(resp);
      }
    });

  }
  
}
</script>


<style>
body {
  background-image: url("@/assets/images/background.jpg");
  background-size: cover;
}
</style>
