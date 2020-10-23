<template>
  <article class="list">
    <ul>
      <li v-for="item in posts" :key="item.No">
        <router-link :to="'posts' + item.No">
          <span class="thumb">
            <img class="cropImg" :src="item.img"/>
            <span class="cropBox" :style=" 'background-image:url(' + item.img + ');' "></span>
          </span>
          <span class="info">
            <strong class="tit">{{ item.title }}</strong>
            <span class="txt">{{ item.date }}</span>
          </span>
        </router-link>
      </li>
    </ul>
  </article>
</template>
<script>
import axios from 'axios';

export default {
  data() {
    return {
      posts: [
        //원 데이터
        /*
        {
          No : "1",
          title: "EOD 고성",
          date: "2019.06.23",
          //img : require('../asstes/images/list01.jpg'),
        },
        */
      ]
    };
  },
  computed: {
    hasResult: function () {
      return this.posts.length > 0
    }
  },

  created: function(){
      const baseURI = 'http://localhost:8087';
      axios.get(`${baseURI}/board`,{
        headers:{

        }
      })
      .then((result) => {
        console.log(result.data);
        this.posts = result.data
      }
  )},

  methods: {

  }
};
</script>

<style scoped lang="scss">

</style>
