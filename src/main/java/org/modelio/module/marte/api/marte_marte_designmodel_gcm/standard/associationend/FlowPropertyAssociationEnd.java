/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class FlowPropertyAssociationEnd {
    public static final String STEREOTYPE_NAME = "FlowProperty_AssociationEnd";

    public static final String FLOWPROPERTY_ASSOCIATIONEND_DIRECTION_TAGTYPE = "FlowProperty_AssociationEnd_direction";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link FlowPropertyAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << FlowProperty_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, FlowPropertyAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << FlowProperty_AssociationEnd >> then instantiate a {@link FlowPropertyAssociationEnd} proxy.
     * 
     * @return a {@link FlowPropertyAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
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
    public static FlowPropertyAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (FlowPropertyAssociationEnd.canInstantiate(obj))
        	return new FlowPropertyAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("FlowPropertyAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    public AssociationEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'FlowProperty_AssociationEnd_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getFlowProperty_AssociationEnd_direction() {
        return this.elt.getTagValue(FlowPropertyAssociationEnd.MdaTypes.FLOWPROPERTY_ASSOCIATIONEND_DIRECTION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'FlowProperty_AssociationEnd_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setFlowProperty_AssociationEnd_direction(final String value) {
        this.elt.putTagValue(FlowPropertyAssociationEnd.MdaTypes.FLOWPROPERTY_ASSOCIATIONEND_DIRECTION_TAGTYPE_ELT, value);
    }

    protected FlowPropertyAssociationEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType FLOWPROPERTY_ASSOCIATIONEND_DIRECTION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
