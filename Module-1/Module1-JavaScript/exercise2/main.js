
const eventName = "Community Cleanup Drive";
const eventDate = "2025-06-10";
let availableSeats = 50;

const eventInfo = `Event: ${eventName}\nDate: ${eventDate}\nSeats Available: ${availableSeats}`;
console.log(eventInfo);

availableSeats--;
console.log(`New Seats Available after registration: ${availableSeats}`);
