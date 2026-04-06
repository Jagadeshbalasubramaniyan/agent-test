@Override
public List<Ticket> getAllCompletedTickets() {
    return ticketRepository.findByCompletedTrue();
}