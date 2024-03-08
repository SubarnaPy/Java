const apikey="68bacec4860bfe3caadff3015025b8c0";
const search=document.querySelector(".search input");
const searchbutton=document.querySelector(".search button");
const apiural="https://api.openweathermap.org/data/2.5/weather?units=metric&q="
async function checkwheather(city){
    const responce=await fetch(apiural+city+`&appid=${apikey}`);
    var data= await responce.json();
    console.log(data);
   document.querySelector(".city").innerHTML=data.name;
    document.querySelector(".tmep").innerHTML=data.main.temp;
    document.querySelector(".humidity").innerHTML=data.main.humidity;
   document.querySelector(".windspeed").innerHTML=data.wind.speed;
}
searchbutton.addEventListener("click",()=>{
checkwheather(search.value);
})