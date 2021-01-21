/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("b1368887-98e1-4f8e-9bdb-ebb049043282")
    public static final String STEREOTYPE_NAME = "FlowProperty_AssociationEnd";

    @objid ("d63a5927-3f36-4587-9720-b67e3fa8ea83")
    public static final String FLOWPROPERTY_ASSOCIATIONEND_DIRECTION_TAGTYPE = "FlowProperty_AssociationEnd_direction";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    @objid ("2233ab55-38f0-42b5-8c98-1c2811079a5e")
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link FlowPropertyAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << FlowProperty_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d2870901-7d55-4abd-81ad-c3caa0466a93")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, FlowPropertyAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << FlowProperty_AssociationEnd >> then instantiate a {@link FlowPropertyAssociationEnd} proxy.
     * 
     * @return a {@link FlowPropertyAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("87edd93c-076a-466c-901e-cfb471e549f3")
    public static FlowPropertyAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, FlowPropertyAssociationEnd.STEREOTYPE_NAME);
        return FlowPropertyAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link FlowPropertyAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << FlowProperty_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link FlowPropertyAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("6889fbce-c8a0-429f-afed-6eaef02b4f7d")
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
    @objid ("ccfd8b31-509c-4806-aa7e-f068e6adbdb9")
    public static FlowPropertyAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (FlowPropertyAssociationEnd.canInstantiate(obj))
        	return new FlowPropertyAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("FlowPropertyAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3e0afa3b-964b-4bf4-b0bb-5172333a1703")
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
    @objid ("e7f482e8-f85a-4631-b86c-bf5081f2d562")
    public AssociationEnd getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'FlowProperty_AssociationEnd_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("27c20ccd-d535-4b85-8875-1c5ad47ce974")
    public String getFlowProperty_AssociationEnd_direction() {
        return this.elt.getTagValue(FlowPropertyAssociationEnd.MdaTypes.FLOWPROPERTY_ASSOCIATIONEND_DIRECTION_TAGTYPE_ELT);
    }

    @objid ("b84ab216-9347-4107-a6ba-bc715c4259b2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'FlowProperty_AssociationEnd_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("98069126-905f-4c91-b31e-99e2ea273f09")
    public void setFlowProperty_AssociationEnd_direction(final String value) {
        this.elt.putTagValue(FlowPropertyAssociationEnd.MdaTypes.FLOWPROPERTY_ASSOCIATIONEND_DIRECTION_TAGTYPE_ELT, value);
    }

    @objid ("6e8d995c-5c0d-48b8-ad31-e16169425373")
    protected FlowPropertyAssociationEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    @objid ("129340c6-5275-4994-aced-4133cfa9b86b")
    public static final class MdaTypes {
        @objid ("60796ec3-cabd-454f-8e4c-6fcd8e0f7d07")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("30b8735e-c480-4855-9104-e6491b275d21")
        public static TagType FLOWPROPERTY_ASSOCIATIONEND_DIRECTION_TAGTYPE_ELT;

        @objid ("992ad3c5-862f-45cf-bc6c-9971a6e74a67")
        private static Stereotype MDAASSOCDEP;

        @objid ("46db66b9-f6f0-4fe9-b972-083b62732d13")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("21f5169f-945b-4834-a836-aac60e087009")
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
