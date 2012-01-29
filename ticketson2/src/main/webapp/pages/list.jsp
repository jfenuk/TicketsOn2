<%@ taglib prefix="s" uri="/struts-tags"%>

<h2>Your Tickets:</h2>
<s:if test="tickets.size > 0">
	<table border="1" width="100%">
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Description</th>
			<th colspan="3">Actions</th>
		</tr>
		<s:iterator value="tickets">
			<tr>

				<td><s:property value="id" /></td>
				<td><s:property value="title" /></td>
				<td><s:property value="description" /></td>
				<td align="center"><a
					href="<s:url action='viewTicket'>
					<s:param name="id" value="id" />
					</s:url>">View</a>
				</td>
				<td align="center"><a
					href="<s:url action='editTicket'>
					<s:param name="id" value="id" />
					</s:url>">Edit</a>
				</td>
				<td align="center"><a
					href="<s:url action='removeTicket'>
					<s:param name="id" value="id" />
					</s:url>">Remove</a>
				</td>
			</tr>
		</s:iterator>
	</table>
</s:if>
<br>
Add new Ticket:
<br>
<s:form action="saveTicket">
	<s:textfield id="id" name="ticket.id" />
	<s:textfield id="title" label="Title" name="ticket.title" />
	<s:textfield id="description" label="Description"
		name="ticket.description" />
	<s:submit />
</s:form>
