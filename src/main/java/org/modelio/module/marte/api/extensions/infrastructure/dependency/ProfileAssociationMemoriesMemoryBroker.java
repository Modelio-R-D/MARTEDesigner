/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_memories_MemoryBroker >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b6c88378-78d0-4c74-8eb1-7b89e89574b9")
public class ProfileAssociationMemoriesMemoryBroker {
    @objid ("7367c3ab-5848-4d50-9880-d5b27bc0ec78")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_memories_MemoryBroker";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("bf83e2e4-cd45-4b72-8b02-14331c074f52")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMemoriesMemoryBroker proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_memories_MemoryBroker >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d70dd03f-2976-4075-924e-a849879045f4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemoriesMemoryBroker.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_memories_MemoryBroker >> then instantiate a {@link ProfileAssociationMemoriesMemoryBroker} proxy.
     * 
     * @return a {@link ProfileAssociationMemoriesMemoryBroker} proxy on the created {@link Dependency}.
     */
    @objid ("e59824fb-4e94-4000-a403-0de42002f260")
    public static ProfileAssociationMemoriesMemoryBroker create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMemoriesMemoryBroker.STEREOTYPE_NAME);
        return ProfileAssociationMemoriesMemoryBroker.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMemoriesMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_memories_MemoryBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMemoriesMemoryBroker} proxy or <i>null</i>.
     */
    @objid ("ea24d813-cfad-4a87-8aca-8688d7aa4cfc")
    public static ProfileAssociationMemoriesMemoryBroker instantiate(final Dependency obj) {
        return ProfileAssociationMemoriesMemoryBroker.canInstantiate(obj) ? new ProfileAssociationMemoriesMemoryBroker(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMemoriesMemoryBroker} proxy from a {@link Dependency} stereotyped << ProfileAssociation_memories_MemoryBroker >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMemoriesMemoryBroker} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ca82d944-26b7-477a-9ab8-fa9ec9bda5b0")
    public static ProfileAssociationMemoriesMemoryBroker safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMemoriesMemoryBroker.canInstantiate(obj))
        	return new ProfileAssociationMemoriesMemoryBroker(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMemoriesMemoryBroker: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9ba0823d-88c3-45d0-ba2a-5bd64d59ffc8")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ProfileAssociationMemoriesMemoryBroker other = (ProfileAssociationMemoriesMemoryBroker) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("ac215731-d4af-4077-a398-7f45e48e0b88")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("dc391654-b809-46aa-b1d8-b59ac3098f1f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("31525baa-51df-4bca-8878-eef28edbb204")
    protected ProfileAssociationMemoriesMemoryBroker(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("9a4ab844-2621-4677-b51e-10673b070c25")
    public static final class MdaTypes {
        @objid ("9c3e8ec7-7f6a-4a84-b4ce-ca93b262dfb6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("61abe41b-63b6-4fc8-b4b8-164c59dd7641")
        private static Stereotype MDAASSOCDEP;

        @objid ("7b6ec72a-3391-406a-9a73-fce417874ad6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("82ea8533-b447-4798-acda-99b9bcd4f585")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "93675be5-9759-11e0-94fb-0027103f347c");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
