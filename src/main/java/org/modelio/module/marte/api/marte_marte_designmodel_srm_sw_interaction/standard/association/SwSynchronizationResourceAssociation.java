/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SwSynchronizationResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6d8f63e8-92c3-4d90-bb81-8fb27c4d15cc")
public class SwSynchronizationResourceAssociation extends SwInteractionResourceAssociation {
    @objid ("2b488d7b-4e38-4263-9f09-6402a30be664")
    public static final String STEREOTYPE_NAME = "SwSynchronizationResource_Association";

    /**
     * Tells whether a {@link SwSynchronizationResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwSynchronizationResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7a718646-97b3-42e8-8e77-f0bae094b46e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwSynchronizationResource_Association >> then instantiate a {@link SwSynchronizationResourceAssociation} proxy.
     * 
     * @return a {@link SwSynchronizationResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("04b02197-9e5f-4c93-8813-ea7fe8313b86")
    public static SwSynchronizationResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceAssociation.STEREOTYPE_NAME);
        return SwSynchronizationResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceAssociation} proxy from a {@link Association} stereotyped << SwSynchronizationResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwSynchronizationResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("4529a664-73f7-4ed1-aa75-5bfe7e60cef8")
    public static SwSynchronizationResourceAssociation instantiate(final Association obj) {
        return SwSynchronizationResourceAssociation.canInstantiate(obj) ? new SwSynchronizationResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceAssociation} proxy from a {@link Association} stereotyped << SwSynchronizationResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SwSynchronizationResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("abcd2dc9-8ecb-44fa-b8f6-d6f7b2ac96bb")
    public static SwSynchronizationResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwSynchronizationResourceAssociation.canInstantiate(obj))
        	return new SwSynchronizationResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwSynchronizationResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("29404337-f956-4c38-a31a-945a667cbfa4")
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
        SwSynchronizationResourceAssociation other = (SwSynchronizationResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("1db1bbf4-f65b-4e50-8149-bdfb2d7092b4")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("aed0946a-5302-4498-a5ac-f1812a7b6cdd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c7e7d91f-5d6e-4d0a-be8f-26d205f59c11")
    protected SwSynchronizationResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("3206515b-6448-41a1-a3d5-757ff83b7e83")
    public static final class MdaTypes {
        @objid ("712dd1b1-b423-4d59-8f8f-19b81e2f44dc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0edf726a-baca-4c66-8d59-955eaf3a1ed7")
        private static Stereotype MDAASSOCDEP;

        @objid ("91477d6f-966a-4564-beca-2159bcfd3331")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cb6010e4-1cf3-40ee-b701-431b0b17f3c3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3d63fb19-10d9-11df-81d9-0014222a9f79");
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
