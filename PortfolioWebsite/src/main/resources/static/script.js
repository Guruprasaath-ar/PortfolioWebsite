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

document.addEventListener("DOMContentLoaded", function () {
    const form = document.querySelector(".contact__form");

    form.addEventListener("submit", function (event) {
        event.preventDefault(); // Stop default form submission for now

        // Optionally: submit via fetch to preserve behavior
        fetch(form.action, {
            method: form.method,
            body: new FormData(form),
        })
            .then(response => {
                if (response.ok) {
                    alert("Message sent successfully!");
                    form.reset(); // Clear the form fields
                } else {
                    alert("Something went wrong. Please try again.");
                }
            })
            .catch(() => {
                alert("Network error. Please try again.");
            });
    });
});
