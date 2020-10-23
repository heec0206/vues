<template>
  <header class="topLayout">
    <nav>
      <ul>
        <!-- <li><router-link to="/"><img src="@/assets/images/icon_info.svg"/></router-link></li> -->
        <li><router-link to="/"><i class="fas fa-list-ul"></i></router-link></li>
        <li><router-link to="/info"><i class="fas fa-user"></i></router-link></li>
      </ul>
    </nav>
  </header>
</template>

<script>
export default {
  data(){
    return{
      activeClass: 'active', errorClass: 'text-danger'
    }
  },
  computed: {

  }
}
</script>

<style scoped lang="scss">

</style>
