console.log('Script loaded successfully!');

const hamburgerBtn = document.getElementById('hamburgerBtn');
const closeNavBtn  = document.getElementById('closeNavBtn');
const mobileNav    = document.getElementById('mobileNav');
const navOverlay   = document.getElementById('navOverlay');
 
function openNav(){
  mobileNav.classList.add('open');
  navOverlay.classList.add('open');
  navOverlay.style.display = 'block';
  document.body.style.overflow = 'hidden';
}
 
function closeNav(){
  mobileNav.classList.remove('open');
  navOverlay.classList.remove('open');
  document.body.style.overflow = '';
  setTimeout(() => { navOverlay.style.display = 'none'; }, 350);
}

hamburgerBtn.addEventListener('click', openNav);
closeNavBtn.addEventListener('click', closeNav);
navOverlay.addEventListener('click', closeNav);