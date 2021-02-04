/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << FlowProperty_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("88a34018-d285-42c5-9a46-cb4128db2d2a")
public class FlowPropertyAssociationEnd {
    @objid ("39f9c33f-d197-46e2-b35c-63ecfa81d37c")
    public static final String STEREOTYPE_NAME = "FlowProperty_AssociationEnd";

    @objid ("824a2bf0-d1d7-47ad-a759-5790295d40ea")
    public static final String FLOWPROPERTY_ASSOCIATIONEND_DIRECTION_TAGTYPE = "FlowProperty_AssociationEnd_direction";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    @objid ("8672342b-716e-4a64-81e4-9e8478ec8b20")
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link FlowPropertyAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << FlowProperty_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c018d2a4-5a71-4891-8d2d-cbfbe1dc0183")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, FlowPropertyAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << FlowProperty_AssociationEnd >> then instantiate a {@link FlowPropertyAssociationEnd} proxy.
     * 
     * @return a {@link FlowPropertyAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("d0d09925-4bdf-4ba1-8927-1561827e3340")
    public static FlowPropertyAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, FlowPropertyAssociationEnd.STEREOTYPE_NAME);
        return FlowPropertyAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link FlowPropertyAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << FlowProperty_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link FlowPropertyAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("63d22491-9c53-4edd-b125-933670b600ae")
    public static FlowPropertyAssociationEnd instantiate(final AssociationEnd obj) {
        return FlowPropertyAssociationEnd.canInstantiate(obj) ? new FlowPropertyAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FlowPropertyAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << FlowProperty_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link FlowPropertyAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("17abc0e0-456c-4b55-b10c-faacbef8d116")
    public static FlowPropertyAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (FlowPropertyAssociationEnd.canInstantiate(obj))
        	return new FlowPropertyAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("FlowPropertyAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("03e0f72f-5faf-4c0e-a7d5-5693a1008a09")
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
        FlowPropertyAssociationEnd other = (FlowPropertyAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("2c804daf-fe59-47c1-bcec-7e25d629380d")
    public AssociationEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'FlowProperty_AssociationEnd_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a56d4edb-3386-4e35-8e3f-48d81ddd4235")
    public String getFlowProperty_AssociationEnd_direction() {
        return this.elt.getTagValue(FlowPropertyAssociationEnd.MdaTypes.FLOWPROPERTY_ASSOCIATIONEND_DIRECTION_TAGTYPE_ELT);
    }

    @objid ("2cf0ed39-346c-4fcb-9e9e-6ebf660b6d9f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'FlowProperty_AssociationEnd_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("653f00ce-1a7c-40be-95ab-26a2a2fc223d")
    public void setFlowProperty_AssociationEnd_direction(final String value) {
        this.elt.putTagValue(FlowPropertyAssociationEnd.MdaTypes.FLOWPROPERTY_ASSOCIATIONEND_DIRECTION_TAGTYPE_ELT, value);
    }

    @objid ("965dac17-ea8a-423b-ac94-91e33bee5ec6")
    protected FlowPropertyAssociationEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    @objid ("129340c6-5275-4994-aced-4133cfa9b86b")
    public static final class MdaTypes {
        @objid ("a85117e8-8b4d-4fac-a91a-304da25361b3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4d7b4d0a-a12e-419c-b738-aa28a9efb58a")
        public static TagType FLOWPROPERTY_ASSOCIATIONEND_DIRECTION_TAGTYPE_ELT;

        @objid ("1c9da0b0-e0cf-4ba1-ae73-7f1d8863b614")
        private static Stereotype MDAASSOCDEP;

        @objid ("49f7505e-3d3b-4d41-9352-fa641c936e41")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("25942f7b-4080-4c09-b04e-bcb903a6c13b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0247a676-0ccf-11df-8525-001302895b2b");
            FLOWPROPERTY_ASSOCIATIONEND_DIRECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0247a679-0ccf-11df-8525-001302895b2b");
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
