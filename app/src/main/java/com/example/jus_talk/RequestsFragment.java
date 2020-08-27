package com.example.jus_talk;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;


public class RequestsFragment extends Fragment {



    public RequestsFragment() {
        // Required empty public constructor
    }
    private DatabaseReference friendRequestReference;
    private DatabaseReference userDatabase;
    private FirebaseUser currentUser;
    private String mCurrentUser;

    //Views
    private RecyclerView recyclerViewAccept;
    private View mRequestView;
    //FirebaseRecyclerAdapter<Accept, RequestsFragment.AcceptViewHolder> acceptAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRequestView = inflater.inflate(R.layout.fragment_requests, container, false);

        /*LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        //RecyclerView

        recyclerViewAccept = (RecyclerView) mRequestView.findViewById(R.id.request_fragment_recycler_view_accept);
        recyclerViewAccept.setLayoutManager(layoutManager);
        recyclerViewAccept.setHasFixedSize(true);
        //Creating Database refrence
        currentUser = FirebaseAuth.getInstance().getCurrentUser();
        mCurrentUser = currentUser.getUid();
        friendRequestReference = FirebaseDatabase.getInstance().getReference().child("Friend_req").child(mCurrentUser);
        friendRequestReference.keepSynced(true);
        userDatabase = FirebaseDatabase.getInstance().getReference().child("Users");
        userDatabase.keepSynced(true);*/

        return mRequestView;
    }

    /*@Override
    public void onStart() {
        super.onStart();

        FirebaseRecyclerOptions<Accept> options =
                new FirebaseRecyclerOptions.Builder<Accept>()
                        .setQuery(friendRequestReference, Accept.class)
                        .build();

         acceptAdapter = new FirebaseRecyclerAdapter<Accept, AcceptViewHolder>(options) {
            @NonNull
            @Override
            public AcceptViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new RequestsFragment.AcceptViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.request_single_layout,parent,false));
            }

            @Override
            protected void onBindViewHolder(@NonNull final AcceptViewHolder holder, int position, @NonNull Accept model) {
                String requestType = model.getRequest_type();

                final String uid = getRef(position).getKey().toString();
                userDatabase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String name = dataSnapshot.child(uid).child("name").getValue().toString();
                        String image = dataSnapshot.child(uid).child("thumbnail").getValue().toString();
                        String status = dataSnapshot.child(uid).child("status").getValue().toString();
                        holder.setStatus(status);
                        holder.setName(name);
                        holder.setImage(image);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });



            }

        };

        recyclerViewAccept.setAdapter(acceptAdapter);
        acceptAdapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        acceptAdapter.stopListening();
    }

    //View Holder class for Accept Request
    public static class AcceptViewHolder extends RecyclerView.ViewHolder {
        View acceptView;
        Button acceptButton;
        Button declineButton;
        public AcceptViewHolder(View itemView) {
            super(itemView);
            acceptView = itemView;
            declineButton = acceptView.findViewById(R.id.request_fragment_button_decline);
            acceptButton = acceptView.findViewById(R.id.request_fragment_button);
        }
        public void setButtons(String type) {
            declineButton.setVisibility(View.INVISIBLE);
            acceptButton.setText("Cancel");
        }
        public void setStatus(final String status) {
            TextView mStatus = acceptView.findViewById(R.id.request_fragment_status);
            mStatus.setText(status);
        }
        public void setName(final String name) {
            TextView acceptName = acceptView.findViewById(R.id.request_fragment_name);
            acceptName.setText(name);
        }
        public void setImage(final String image) {
            CircleImageView mImage = (CircleImageView) acceptView.findViewById(R.id.request_fragment_image);
            //picasso image downloading and
            Picasso.get().load(image).placeholder(R.drawable.avatar_default).into(mImage);
        }
    }*/
}