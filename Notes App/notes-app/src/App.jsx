import React, { useState, useEffect } from "react";
import "./App.css";

const App = () => {
  const [heading, setHeading] = useState("");
  const [description, setDescription] = useState("");
  const [notes, setNotes] = useState([]);
  const [editIndex, setEditIndex] = useState(null);
  const [showEditModal, setShowEditModal] = useState(false);

  // Load Notes on mount
  useEffect(() => {
    const saved = localStorage.getItem("notes-app");
    if (saved) setNotes(JSON.parse(saved));
  }, []);

  // Save Notes on change
  useEffect(() => {
    localStorage.setItem("notes-app", JSON.stringify(notes));
  }, [notes]);

  const onSubmitChange = (e) => {
    e.preventDefault();
    if (!heading.trim() || !description.trim()) return;

    const newNote = { heading, description, id: Date.now() };

    setNotes([newNote, ...notes]);

    setHeading("");
    setDescription("");
  };

  const deleteNote = (index) => {
    const copyNotes=[...notes];
    copyNotes.splice(index,1);
    setNotes(copyNotes);
  };

  const openEditModal = (note, index) => {
    setHeading(note.heading);
    setDescription(note.description);
    setEditIndex(index);
    setShowEditModal(true);
  };

  const saveEdit = () => {
    const updated = [...notes];
    updated[editIndex] = {
      ...updated[editIndex],
      heading,
      description,
    };
    setNotes(updated);

    setShowEditModal(false);
    setEditIndex(null);
    setHeading("");
    setDescription("");
  };

  return (
    <div className="notebook">
      {/* Spiral Rings */}
      <div className="spiral-container">
        {[...Array(12)].map((_, i) => (
          <div className="spiral" key={i}></div>
        ))}
      </div>

      <div className="container">
        <h1 className="title">My Sticky Notes</h1>

        {/* Add Note Form */}
        <form className="note-form" onSubmit={onSubmitChange}>
          <input
            type="text"
            placeholder="Note title..."
            className="input"
            value={heading}
            onChange={(e) => setHeading(e.target.value)}
          />

          <textarea
            placeholder="Write your thoughts..."
            className="textarea"
            value={description}
            onChange={(e) => setDescription(e.target.value)}
          />

          <button className="btn" type="submit">
            + Add Note
          </button>
        </form>

        <h2 className="notes-title">Your Notes</h2>

        {/* Notes Display */}
        <div className="notes-grid">
          {notes.map((note, index) => (
            <div className="note-card fade-in" key={note.index}>
              <button
                className="delete-btn"
                onClick={() => deleteNote(note.index)}
              >
                ×
              </button>

              <h3 className="note-heading">{note.heading}</h3>
              <p className="note-description">{note.description}</p>

              <button
                className="edit-btn"
                onClick={() => openEditModal(note, index)}
              >
                Edit
              </button>
            </div>
          ))}
        </div>
      </div>

      {/* Edit Modal */}
      {showEditModal && (
        <div className="modal-overlay fade-in">
          <div className="modal popup">
            <h2>Edit Note</h2>
            <input
              type="text"
              className="input"
              value={heading}
              onChange={(e) => setHeading(e.target.value)}
            />
            <textarea
              className="textarea"
              value={description}
              onChange={(e) => setDescription(e.target.value)}
            />
            <button className="btn" onClick={saveEdit}>
              Save Changes
            </button>
            <button
              className="cancel-btn"
              onClick={() => setShowEditModal(false)}
            >
              Cancel
            </button>
          </div>
        </div>
      )}
    </div>
  );
};

export default App;
