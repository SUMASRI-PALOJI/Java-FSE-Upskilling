
const events = [];

function addEvent(name, date, seats, category) {
  events.push({ name, date, seats, category });
}

function registerUser(eventName) {
  const event = events.find(e => e.name === eventName);
  if (event && event.seats > 0) {
    event.seats--;
    console.log(`Registered for ${event.name}. Remaining seats: ${event.seats}`);
  } else {
    console.log(`Registration failed for ${eventName}.`);
  }
}

function filterEvents(callback) {
  return events.filter(callback);
}

function filterEventsByCategory(category) {
  return filterEvents(event => event.category === category);
}
function createCategoryTracker(category) {
  let count = 0;
  return function registerInCategory(eventName) {
    const event = events.find(e => e.name === eventName && e.category === category);
    if (event && event.seats > 0) {
      event.seats--;
      count++;
      console.log(`Registered in ${category}: ${event.name} (Total: ${count})`);
    } else {
      console.log(`Failed to register in ${category}: ${eventName}`);
    }
  };
}
addEvent("Yoga Camp", "2025-06-05", 20, "Health");
addEvent("Book Fair", "2025-06-12", 30, "Education");
addEvent("Blood Donation", "2025-06-15", 15, "Health");

const healthRegister = createCategoryTracker("Health");
healthRegister("Yoga Camp");
healthRegister("Blood Donation");

const educationEvents = filterEventsByCategory("Education");
console.log("Education Events:", educationEvents);
