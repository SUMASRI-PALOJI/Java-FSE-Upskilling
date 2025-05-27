const today = new Date("2025-05-26"); 

const events = [
  { name: "Beach Cleanup", date: "2025-06-01", seats: 10 },
  { name: "Old Town Walk", date: "2025-05-01", seats: 5 },
  { name: "Tree Plantation", date: "2025-06-15", seats: 0 },
  { name: "Health Camp", date: "2025-06-20", seats: 25 }
];

events.forEach(event => {
  const eventDate = new Date(event.date);
  if (eventDate > today && event.seats > 0) {
    console.log(`Upcoming Event: ${event.name} on ${event.date} — Seats: ${event.seats}`);
  } else {
    console.log(`(Hidden) ${event.name} - Not valid (Past or Full)`);
  }
});

function register(event) {
  try {
    if (event.seats <= 0) {
      throw new Error("Registration failed: No seats available.");
    }
    event.seats--;
    console.log(`✅ Registered for ${event.name}. Remaining seats: ${event.seats}`);
  } catch (error) {
    console.error(`❌ ${error.message}`);
  }
}
register(events[0]); 
register(events[2]); 
