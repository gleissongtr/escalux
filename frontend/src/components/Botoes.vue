<template>
  <div>
    <div class="row">
      <template v-for="variant in ['primary','secondary','success','outline-success','warning','danger','link']">
        <div class="col-md-4 pb-2" v-for="size in ['sm','','lg']" :key="`${variant}_${size}`">
          <b-button :size="size" :variant="variant">
           {{name}} {{variant}} {{size}}
          </b-button>
        </div>
      </template>
    </div>
  </div>
</template>

<script>
export default {
  data () {
    return {
      name: 'GTR'
    }
  }
}
</script>
