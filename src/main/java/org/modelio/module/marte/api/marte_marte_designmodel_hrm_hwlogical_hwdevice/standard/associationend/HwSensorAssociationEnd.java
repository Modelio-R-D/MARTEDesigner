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
 * Proxy class to handle a {@link AssociationEnd} with << HwSensor_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3864dcab-4cd5-4d75-a3ff-e0b65c127690")
public class HwSensorAssociationEnd extends HwIOAssociationEnd {
    @objid ("f0dec7ac-9b97-4f0b-8241-226290a18470")
    public static final String STEREOTYPE_NAME = "HwSensor_AssociationEnd";

    /**
     * Tells whether a {@link HwSensorAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwSensor_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4bbd4c06-9a32-4cae-ae91-18503ed5f83d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwSensor_AssociationEnd >> then instantiate a {@link HwSensorAssociationEnd} proxy.
     * 
     * @return a {@link HwSensorAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("57bf5a45-6686-4b75-a05b-4d1460a9bebf")
    public static HwSensorAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorAssociationEnd.STEREOTYPE_NAME);
        return HwSensorAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwSensorAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwSensor_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwSensorAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("12d45915-26b4-4fd1-9b9e-f8b6e128f6b1")
    public static HwSensorAssociationEnd instantiate(final AssociationEnd obj) {
        return HwSensorAssociationEnd.canInstantiate(obj) ? new HwSensorAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSensorAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwSensor_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwSensorAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0b39186f-efc0-47dd-ae76-b68e8e4cf4e1")
    public static HwSensorAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwSensorAssociationEnd.canInstantiate(obj))
        	return new HwSensorAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwSensorAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("106467d9-2d71-412f-b04d-2ba987fdd3f2")
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
        HwSensorAssociationEnd other = (HwSensorAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("409f8b32-4244-493c-bbad-90054d200160")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("fa9f5d4f-9749-4ad6-a525-6631ed30143d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3084cb2c-7cdc-4c7f-a3ed-19cc6709a678")
    protected HwSensorAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("d4e56b01-043b-4e4d-ac99-ac5742755ff0")
    public static final class MdaTypes {
        @objid ("fa217ae5-e6e5-47b2-bde3-35b0752330a7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("189917ce-1095-4d3c-ab30-097eb5224bd5")
        private static Stereotype MDAASSOCDEP;

        @objid ("5444ffa6-2ea6-4c2f-98ac-7d9f04fe390e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1644c0b0-7594-49e3-a826-f60face63663")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e89de849-c7ac-11df-ad39-001302895b2b");
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
