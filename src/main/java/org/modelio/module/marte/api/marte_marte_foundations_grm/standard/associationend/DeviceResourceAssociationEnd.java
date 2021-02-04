/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

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
 * Proxy class to handle a {@link AssociationEnd} with << DeviceResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("102b4d64-6955-444e-9864-0d4c59beabdd")
public class DeviceResourceAssociationEnd extends ProcessingResourceAssociationEnd {
    @objid ("4f54c3db-1948-4d90-9d69-2a227597aabc")
    public static final String STEREOTYPE_NAME = "DeviceResource_AssociationEnd";

    /**
     * Tells whether a {@link DeviceResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << DeviceResource_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3d4a84ad-ccff-4a2d-94e4-4e5424b0f7ce")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << DeviceResource_AssociationEnd >> then instantiate a {@link DeviceResourceAssociationEnd} proxy.
     * 
     * @return a {@link DeviceResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("4e51d2be-b74e-4831-91d8-bccfb9eadd41")
    public static DeviceResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DeviceResourceAssociationEnd.STEREOTYPE_NAME);
        return DeviceResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link DeviceResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << DeviceResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link DeviceResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("aec9195e-8d7c-4c6b-a4cc-e88aa18ddae3")
    public static DeviceResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return DeviceResourceAssociationEnd.canInstantiate(obj) ? new DeviceResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DeviceResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << DeviceResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link DeviceResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3d9fd196-0dad-484e-90b9-4b4f74bbb605")
    public static DeviceResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (DeviceResourceAssociationEnd.canInstantiate(obj))
        	return new DeviceResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("DeviceResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("641cd0be-b1df-4a2b-95a9-82f695f8359c")
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
        DeviceResourceAssociationEnd other = (DeviceResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("a240af5e-f783-44cc-90c0-b4797764e402")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("016b918a-1662-4151-8b0e-84757a782661")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cb655e1d-c7cd-473d-9fbb-b7bd18734b29")
    protected DeviceResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("21a7f360-df1e-4224-ba39-3c4c6d44e8d2")
    public static final class MdaTypes {
        @objid ("6d5f39e5-30d1-433a-b0fe-ab97ad002f1d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("facdf33f-9b56-42a8-ae1d-7dc6789ccfce")
        private static Stereotype MDAASSOCDEP;

        @objid ("a6231efa-6232-459c-a351-3ef7a6d35f33")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e856df41-5d20-4606-a53d-ef0df8d2d11f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "009a84d6-0ccf-11df-8525-001302895b2b");
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
