<template>
  <ContentField>我的bot</ContentField>
</template>

<script>
import ContentField from "../../../components/ContentField.vue";
import $ from "jquery";
import { useStore } from "vuex";

export default {
  components: {
    ContentField,
  },
  setup() {
    const store = useStore();
    // $.ajax({
    //     url: "http://127.0.0.1:3000/user/bot/add/",
    //     type: "POST",
    //     data: {
    //         title: "Bot标题",
    //         description: "Bot描述",
    //         content: "Bot代码",
    //     },
    //     headers: {
    //         Authorization: "Bearer " + store.state.user.token,
    //     },
    //     success(resp) {
    //         console.log(resp);
    //     },
    //     error(resp) {
    //         console.log(resp);
    //     }
    // })
    // $.ajax({
    //   url: "http://127.0.0.1:3000/user/bot/remove/",
    //   type: "POST",
    //   data: {
    //     bot_id: 6,
    //   },
    //   headers: {
    //     Authorization: "Bearer " + store.state.user.token,
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   },
    // });
    // $.ajax({
    //     url: "http://127.0.0.1:3000/user/bot/update/",
    //     type: "POST",
    //     data: {
    //         bot_id: 3,
    //         title: "Bot标题3",
    //         description: "Bot描述3",
    //         content: "Bot代码3",
    //     },
    //     headers: {
    //         Authorization: "Bearer " + store.state.user.token,
    //     },
    //     success(resp) {
    //         console.log(resp);
    //     },
    //     error(resp) {

    //         console.log(resp);
    //     }
    // })
 $.ajax({
        url: "http://127.0.0.1:3000/user/bot/getlist/",
        type: "GET",
        headers: {
            Authorization: "Bearer " + store.state.user.token,
        },
        success(resp) {
            console.log(resp);
        },
        error(resp) {

            console.log(resp);
        }
    })
  },
};
</script>

<style scoped>
</style>
