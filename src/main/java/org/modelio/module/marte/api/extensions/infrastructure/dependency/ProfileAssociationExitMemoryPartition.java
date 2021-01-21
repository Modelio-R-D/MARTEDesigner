/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_exit_MemoryPartition >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("53094770-3d57-40a4-8660-74407f550d42")
public class ProfileAssociationExitMemoryPartition {
    @objid ("e268d420-ea51-4e03-a543-9e1950fd179e")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_exit_MemoryPartition";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("11ed1318-46ad-4ceb-b87e-046354bcf0a1")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationExitMemoryPartition proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_exit_MemoryPartition >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f7eda32f-2db0-418c-861a-a1710cc359a5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationExitMemoryPartition.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_exit_MemoryPartition >> then instantiate a {@link ProfileAssociationExitMemoryPartition} proxy.
     * 
     * @return a {@link ProfileAssociationExitMemoryPartition} proxy on the created {@link Dependency}.
     */
    @objid ("fa2d5415-ed71-4d00-8def-51c21410ec12")
    public static ProfileAssociationExitMemoryPartition create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationExitMemoryPartition.STEREOTYPE_NAME);
        return ProfileAssociationExitMemoryPartition.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationExitMemoryPartition} proxy from a {@link Dependency} stereotyped << ProfileAssociation_exit_MemoryPartition >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationExitMemoryPartition} proxy or <i>null</i>.
     */
    @objid ("1e8b82e3-71bd-4c08-8bf0-7d26c554c9bb")
    public static ProfileAssociationExitMemoryPartition instantiate(final Dependency obj) {
        return ProfileAssociationExitMemoryPartition.canInstantiate(obj) ? new ProfileAssociationExitMemoryPartition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationExitMemoryPartition} proxy from a {@link Dependency} stereotyped << ProfileAssociation_exit_MemoryPartition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationExitMemoryPartition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ef06374e-11c1-437a-b5c5-71fc2b1580c9")
    public static ProfileAssociationExitMemoryPartition safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationExitMemoryPartition.canInstantiate(obj))
        	return new ProfileAssociationExitMemoryPartition(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationExitMemoryPartition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c82b61ec-5c18-4df1-b8ff-5afc0e03bed2")
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
        ProfileAssociationExitMemoryPartition other = (ProfileAssociationExitMemoryPartition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("6c01c5cd-70e1-46fe-8854-77b6152491cc")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("40c61227-abf4-4ace-9309-9a8e1051be3a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("8db9b72f-c188-4a47-9a4c-cbae46945113")
    protected ProfileAssociationExitMemoryPartition(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("425a6c2f-5ed3-4a11-b023-d67108f12a71")
    public static final class MdaTypes {
        @objid ("1ca56628-82d0-449b-8e5d-ffac2a96af89")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ebb57c5b-e646-419e-85b7-280ca8ece990")
        private static Stereotype MDAASSOCDEP;

        @objid ("844f2e6e-87b2-4b71-be58-8a8224354add")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("78ca64dc-f09d-4375-8070-28c29767cb58")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "72aa7b12-9757-11e0-94fb-0027103f347c");
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
