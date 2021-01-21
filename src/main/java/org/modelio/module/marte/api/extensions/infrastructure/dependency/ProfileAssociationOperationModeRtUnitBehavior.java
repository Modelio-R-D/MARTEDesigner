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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_operationMode_RtUnit_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f940468a-8365-4a5f-8b7c-1f10cecb70e0")
public class ProfileAssociationOperationModeRtUnitBehavior {
    @objid ("7bef4494-01b3-4c3b-a413-60c070f6b809")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_operationMode_RtUnit_Behavior";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("44801ecf-0d51-41c0-9a0c-e161cc34e71c")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOperationModeRtUnitBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_operationMode_RtUnit_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b595efc6-cfc4-4aed-90c7-4d6108b3025e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOperationModeRtUnitBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_operationMode_RtUnit_Behavior >> then instantiate a {@link ProfileAssociationOperationModeRtUnitBehavior} proxy.
     * 
     * @return a {@link ProfileAssociationOperationModeRtUnitBehavior} proxy on the created {@link Dependency}.
     */
    @objid ("04264b06-595f-4d1f-a85d-0eaba2135378")
    public static ProfileAssociationOperationModeRtUnitBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOperationModeRtUnitBehavior.STEREOTYPE_NAME);
        return ProfileAssociationOperationModeRtUnitBehavior.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOperationModeRtUnitBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_operationMode_RtUnit_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOperationModeRtUnitBehavior} proxy or <i>null</i>.
     */
    @objid ("7bd3b649-da58-4a00-8c7c-e93cdc3ad0ed")
    public static ProfileAssociationOperationModeRtUnitBehavior instantiate(final Dependency obj) {
        return ProfileAssociationOperationModeRtUnitBehavior.canInstantiate(obj) ? new ProfileAssociationOperationModeRtUnitBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOperationModeRtUnitBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_operationMode_RtUnit_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationOperationModeRtUnitBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("af7d4012-c462-4399-9c09-5589b5bbe4a3")
    public static ProfileAssociationOperationModeRtUnitBehavior safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOperationModeRtUnitBehavior.canInstantiate(obj))
        	return new ProfileAssociationOperationModeRtUnitBehavior(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOperationModeRtUnitBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f0a2df4c-da8a-4eb8-bcee-9b089d7560ba")
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
        ProfileAssociationOperationModeRtUnitBehavior other = (ProfileAssociationOperationModeRtUnitBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("619e17dd-1afa-4fd9-a2ce-f70d811db1c7")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("39a49af6-e97d-47dd-97e7-33656a7578e7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("8b4dc71a-c6a2-4368-b1a7-096b3b54196b")
    protected ProfileAssociationOperationModeRtUnitBehavior(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("74ca04a5-718e-4fa9-90a6-0eb7aa1d84c1")
    public static final class MdaTypes {
        @objid ("a5262c09-95a5-4c30-bcbf-ed5511e17606")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ca5ed2b3-41f5-47d3-bbd8-620ebb68da07")
        private static Stereotype MDAASSOCDEP;

        @objid ("eac413ef-397b-48b7-b8b1-e7680fa8cb5d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("12498394-bc7e-408c-ae5e-418915eefee7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d8d9fdd2-91da-11e0-a465-0027103f347c");
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
