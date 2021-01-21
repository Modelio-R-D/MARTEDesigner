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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_connectedTo_HwEndPoint_HwMedia >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7a0b4660-8de7-43f5-a71e-ce740646268d")
public class ProfileAssociationConnectedToHwEndPointHwMedia {
    @objid ("0c4d1689-1cf2-4f17-b2a5-8aac29eefab9")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_connectedTo_HwEndPoint_HwMedia";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("e61c91be-454f-435d-9aba-f696d7336c88")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationConnectedToHwEndPointHwMedia proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_connectedTo_HwEndPoint_HwMedia >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("69da7a52-341d-4868-b4b4-895fd6fd0f29")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationConnectedToHwEndPointHwMedia.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_connectedTo_HwEndPoint_HwMedia >> then instantiate a {@link ProfileAssociationConnectedToHwEndPointHwMedia} proxy.
     * 
     * @return a {@link ProfileAssociationConnectedToHwEndPointHwMedia} proxy on the created {@link Dependency}.
     */
    @objid ("335781df-70bb-4c5e-9504-3600ede5ddeb")
    public static ProfileAssociationConnectedToHwEndPointHwMedia create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationConnectedToHwEndPointHwMedia.STEREOTYPE_NAME);
        return ProfileAssociationConnectedToHwEndPointHwMedia.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationConnectedToHwEndPointHwMedia} proxy from a {@link Dependency} stereotyped << ProfileAssociation_connectedTo_HwEndPoint_HwMedia >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationConnectedToHwEndPointHwMedia} proxy or <i>null</i>.
     */
    @objid ("bbdcbddb-d9d8-42ab-9ad3-bf2a8fe24630")
    public static ProfileAssociationConnectedToHwEndPointHwMedia instantiate(final Dependency obj) {
        return ProfileAssociationConnectedToHwEndPointHwMedia.canInstantiate(obj) ? new ProfileAssociationConnectedToHwEndPointHwMedia(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationConnectedToHwEndPointHwMedia} proxy from a {@link Dependency} stereotyped << ProfileAssociation_connectedTo_HwEndPoint_HwMedia >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationConnectedToHwEndPointHwMedia} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ddcbad5b-8ddf-410b-8388-ed74b31c0c16")
    public static ProfileAssociationConnectedToHwEndPointHwMedia safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationConnectedToHwEndPointHwMedia.canInstantiate(obj))
        	return new ProfileAssociationConnectedToHwEndPointHwMedia(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationConnectedToHwEndPointHwMedia: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3ecccd1c-d83b-4000-b7f2-891eea96d76e")
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
        ProfileAssociationConnectedToHwEndPointHwMedia other = (ProfileAssociationConnectedToHwEndPointHwMedia) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("8e7201b3-8883-4798-9ceb-fae5c74955a8")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("edde3fe4-2872-4c88-ad07-8f901b39b241")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d29b5522-ec9a-4f5d-8d71-eb005277b793")
    protected ProfileAssociationConnectedToHwEndPointHwMedia(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("92fc865f-7950-4fe9-bdb7-de6735846ea3")
    public static final class MdaTypes {
        @objid ("fa0fd764-af97-48cf-b5db-d25b4d7e8845")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e3fd24ea-8ff6-48fa-808d-859e7b5266e6")
        private static Stereotype MDAASSOCDEP;

        @objid ("eaa60e67-dfe0-4fbf-a00d-2df4a88fc922")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("079e0d53-dc47-4a9f-a166-728ae5fd61fc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dcb5d3dc-936a-11e0-b960-0027103f347c");
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
