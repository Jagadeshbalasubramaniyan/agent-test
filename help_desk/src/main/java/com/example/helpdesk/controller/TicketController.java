@GetMapping("/completed")
public ResponseEntity<List<Ticket>> getAllCompletedTickets() {
    List<Ticket> completedTickets = ticketService.getAllCompletedTickets();
    return new ResponseEntity<>(completedTickets, HttpStatus.OK);
}