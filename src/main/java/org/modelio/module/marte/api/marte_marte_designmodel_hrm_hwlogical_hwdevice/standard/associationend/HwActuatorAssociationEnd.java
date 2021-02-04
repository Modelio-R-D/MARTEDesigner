/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("b659be07-7e6a-4f69-a552-00d3df0c13ed")
    public static final String STEREOTYPE_NAME = "HwActuator_AssociationEnd";

    /**
     * Tells whether a {@link HwActuatorAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwActuator_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("468ae31a-ee90-4c64-be05-c1c482f47978")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwActuator_AssociationEnd >> then instantiate a {@link HwActuatorAssociationEnd} proxy.
     * 
     * @return a {@link HwActuatorAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("aa0a4e50-1e67-4d19-96a6-d664a216f60d")
    public static HwActuatorAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorAssociationEnd.STEREOTYPE_NAME);
        return HwActuatorAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwActuatorAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwActuator_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwActuatorAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("0ba2a4ae-cc0b-4be3-9084-b50e87e1afd4")
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
    @objid ("bc5528fd-e832-4e3f-896c-a4e366b5d9bc")
    public static HwActuatorAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwActuatorAssociationEnd.canInstantiate(obj))
        	return new HwActuatorAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwActuatorAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ba9d7351-b891-4ee7-a523-9c5c623ed314")
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
    @objid ("46181bfd-653f-4c20-9d88-3d0794682a75")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("2d73dd73-e5dd-46a5-ac89-598f666cabb5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("11aea026-5167-48ff-bfd1-b44ed8df3041")
    protected HwActuatorAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("b0649772-3e70-40c6-a0fd-79ae5feefa0c")
    public static final class MdaTypes {
        @objid ("dea95d5e-19da-4e9f-abf2-476ff3062bb8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("19d7a5f0-aabb-478b-b6d3-6e0b7a4cdba5")
        private static Stereotype MDAASSOCDEP;

        @objid ("dbd56dba-a5e1-426f-a159-121e93e78c45")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e58069b5-25cb-461d-bb52-0470932fb3a0")
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
