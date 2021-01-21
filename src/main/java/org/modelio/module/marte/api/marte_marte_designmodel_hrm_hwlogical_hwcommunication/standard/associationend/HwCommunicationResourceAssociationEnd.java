/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.associationend.HwResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwCommunicationResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4648bbec-6713-49c0-93db-7dab49f6bc1b")
public class HwCommunicationResourceAssociationEnd extends HwResourceAssociationEnd {
    @objid ("b28ef0fa-0c06-410a-9b59-479e5f554f42")
    public static final String STEREOTYPE_NAME = "HwCommunicationResource_AssociationEnd";

    /**
     * Tells whether a {@link HwCommunicationResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwCommunicationResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("cfa711b1-9871-4f63-a1ee-6b0935f40cc9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwCommunicationResource_AssociationEnd >> then instantiate a {@link HwCommunicationResourceAssociationEnd} proxy.
     * 
     * @return a {@link HwCommunicationResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("5c01ccf9-c769-41ce-87ae-3dbd18e2c461")
    public static HwCommunicationResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceAssociationEnd.STEREOTYPE_NAME);
        return HwCommunicationResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwCommunicationResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwCommunicationResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("be976b7e-6f8e-4eb6-9e35-8fc8aed36819")
    public static HwCommunicationResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return HwCommunicationResourceAssociationEnd.canInstantiate(obj) ? new HwCommunicationResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwCommunicationResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwCommunicationResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f8240550-dd20-4eef-a11d-bf9a7fc300bf")
    public static HwCommunicationResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwCommunicationResourceAssociationEnd.canInstantiate(obj))
        	return new HwCommunicationResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwCommunicationResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("77747c64-0bc7-4397-8364-85d18b18ba18")
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
        HwCommunicationResourceAssociationEnd other = (HwCommunicationResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("f5c4441a-2f05-4ef9-a144-6d2c63e68bf1")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("950d3f2d-c8e2-4e15-825b-90f714be94bf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b02b06fb-ba7c-4fe4-b7f3-48749498a8fe")
    protected HwCommunicationResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("e6803bd7-cd76-43c5-b922-1645848d4bbe")
    public static final class MdaTypes {
        @objid ("05171192-d09c-4018-8df3-2f3b3dbace85")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2d02c875-6c36-457e-9b5d-fb28d492ef28")
        private static Stereotype MDAASSOCDEP;

        @objid ("0b0a230b-520e-44f1-b89a-dc0c0a15a788")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("915fc80d-d56c-41d3-9107-89a453fa9101")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00fea643-0ccf-11df-8525-001302895b2b");
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
