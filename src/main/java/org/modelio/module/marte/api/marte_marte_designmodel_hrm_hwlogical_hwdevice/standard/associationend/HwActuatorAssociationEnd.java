/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.associationend;

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
 * Proxy class to handle a {@link AssociationEnd} with << HwActuator_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("331c2ab3-e22e-4897-abfa-31f4b5092b81")
public class HwActuatorAssociationEnd extends HwIOAssociationEnd {
    @objid ("8780c25d-a588-4aaa-8514-2b5597ee7134")
    public static final String STEREOTYPE_NAME = "HwActuator_AssociationEnd";

    /**
     * Tells whether a {@link HwActuatorAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwActuator_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b7e44ec4-2b94-488e-b299-b2307b707c27")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwActuator_AssociationEnd >> then instantiate a {@link HwActuatorAssociationEnd} proxy.
     * 
     * @return a {@link HwActuatorAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("ff303df9-cc9d-40cb-ade7-c5915804fcc4")
    public static HwActuatorAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorAssociationEnd.STEREOTYPE_NAME);
        return HwActuatorAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwActuatorAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwActuator_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwActuatorAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("822246f0-f47c-4875-b268-f576e6eccc00")
    public static HwActuatorAssociationEnd instantiate(final AssociationEnd obj) {
        return HwActuatorAssociationEnd.canInstantiate(obj) ? new HwActuatorAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwActuatorAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwActuator_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwActuatorAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0638bf80-b941-48aa-b6b6-7f86b7299b1f")
    public static HwActuatorAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwActuatorAssociationEnd.canInstantiate(obj))
        	return new HwActuatorAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwActuatorAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f651c7e6-a994-46e6-b125-54856b06e9c3")
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
        HwActuatorAssociationEnd other = (HwActuatorAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("134fc384-a557-41f8-9cde-94ab2b54eeff")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("ebd1d281-5863-46dc-aa33-bdfeb7c39419")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d03572dc-4f72-4ccc-8a5f-93c12a359863")
    protected HwActuatorAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("b0649772-3e70-40c6-a0fd-79ae5feefa0c")
    public static final class MdaTypes {
        @objid ("423f7eee-d207-4a07-a1a2-17f5e4bf523d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("00ff97ef-9252-42c6-9cc0-ddae8d99e6fa")
        private static Stereotype MDAASSOCDEP;

        @objid ("51321083-7e10-493b-8613-87612c106e2f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ea9550ba-99de-4cfc-b2a7-9d4162c1bbec")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "88a37410-c7ac-11df-ad39-001302895b2b");
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
