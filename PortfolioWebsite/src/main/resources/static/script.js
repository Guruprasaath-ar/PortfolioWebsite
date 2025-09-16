const menuToggle = document.getElementById('menu-toggle');
const navGrid = document.getElementById('nav-grid');
const navLinks = document.querySelectorAll('.nav-link');
const navHighlight = document.getElementById('nav-highlight');

menuToggle.addEventListener('click', () => {
    navGrid.classList.toggle('open');
    const icon = document.getElementById('menu-icon');
    icon.classList.toggle('fa-bars');
    icon.classList.toggle('fa-xmark');
});

// Active link highlighting
function setActiveLink() {
    navLinks.forEach(link => link.classList.remove('active'));
    this.classList.add('active');
    updateHighlight(this);
    if (navGrid.classList.contains('open')) navGrid.classList.remove('open');
}

function updateHighlight(element) {
    const rect = element.getBoundingClientRect();
    navHighlight.style.width = `${rect.width}px`;
    navHighlight.style.left = `${element.offsetLeft}px`;
}

navLinks.forEach(link => {
    link.addEventListener('click', setActiveLink);
});

// Update highlight on page load
updateHighlight(document.querySelector('.nav-link.active'));

// Back to Top button
const backToTopBtn = document.getElementById('back-to-top');
window.addEventListener('scroll', () => {
    if (window.scrollY > 600) {
        backToTopBtn.classList.add('show');
    } else {
        backToTopBtn.classList.remove('show');
    }
    // Navbar style
    const navbar = document.getElementById('navbar');
    if (window.scrollY > 50) {
        navbar.classList.add('scrolled');
    } else {
        navbar.classList.remove('scrolled');
    }
});

backToTopBtn.addEventListener('click', () => {
    window.scrollTo({ top: 0, behavior: 'smooth' });
});

// Loader
window.addEventListener('load', () => {
    const loader = document.getElementById('loader');
    setTimeout(() => loader.classList.add('hidden'), 400);
});

// Intersection Observer for scroll animations (AOS replacement)
const observer = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
        if (entry.isIntersecting) {
            entry.target.classList.add('in-view');
        }
    });
}, { threshold: 0.2 });

[...document.querySelectorAll('[data-aos]')].forEach(el => observer.observe(el));

// Skills pop effect
[...document.querySelectorAll('.skill')].forEach(skill => {
    skill.addEventListener('click', () => {
        skill.classList.toggle('active');
    });
});

// document.addEventListener("DOMContentLoaded", function () {
//     const form = document.querySelector(".contact__form");
//
//     form.addEventListener("submit", function (event) {
//         event.preventDefault();
//
//         const formData = new FormData(form);
//         formData.append("access_key", "7d262770-faa2-4c46-969d-0404223abb0b");
//
//         // Remove the redirect field - handle it in JavaScript instead
//         // formData.append("redirect", "https://web3forms.com/success"); // Don't add this
//
//         fetch("https://api.web3forms.com/submit", {
//             method: "POST",
//             body: formData // Don't set Content-Type header - let browser handle it
//         })
//             .then(async (response) => {
//                 let json = await response.json();
//
//                 if (response.ok) {
//                     alert("✅ Message sent successfully!");
//                     form.reset();
//                     // Handle redirect here instead of using redirect input
//                     // window.location.href = "success.html"; // Uncomment if you want to redirect
//                 } else {
//                     alert("❌ Error: " + json.message);
//                 }
//             })
//             .catch((error) => {
//                 console.error("Error:", error);
//                 alert("⚠ Network error. Please try again.");
//             });
//     });
// });

