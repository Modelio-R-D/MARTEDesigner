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
 * Proxy class to handle a {@link AssociationEnd} with << HwSupport_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e00bd594-b5de-49ad-9a88-bc24eb5c9cbd")
public class HwSupportAssociationEnd extends HwDeviceAssociationEnd {
    @objid ("3dbf480b-a471-43ce-892d-358bccb318b0")
    public static final String STEREOTYPE_NAME = "HwSupport_AssociationEnd";

    /**
     * Tells whether a {@link HwSupportAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwSupport_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1243bca2-f4f4-4b91-b304-71b1c0eac6fa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwSupport_AssociationEnd >> then instantiate a {@link HwSupportAssociationEnd} proxy.
     * 
     * @return a {@link HwSupportAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("e7cf5a00-4f39-4759-8d5f-065291d33801")
    public static HwSupportAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportAssociationEnd.STEREOTYPE_NAME);
        return HwSupportAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwSupportAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwSupport_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwSupportAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("8ce73a3e-be73-4a19-8997-318a376e6358")
    public static HwSupportAssociationEnd instantiate(final AssociationEnd obj) {
        return HwSupportAssociationEnd.canInstantiate(obj) ? new HwSupportAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSupportAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwSupport_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwSupportAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("128f151a-619a-4593-9094-822c9c88b288")
    public static HwSupportAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwSupportAssociationEnd.canInstantiate(obj))
        	return new HwSupportAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwSupportAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2ba6479f-a31a-4875-af63-1d4da8adcb87")
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
        HwSupportAssociationEnd other = (HwSupportAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("5bc3eaea-6ed0-4ded-aa0a-e428dcef5126")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("cb6f46f5-c094-4c4f-b1fd-5f9a430b8f84")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("58f09d8b-877a-4a0a-9193-f14a9c28827a")
    protected HwSupportAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("6a7ea22c-3c7d-425a-aaa8-ae5e733a1958")
    public static final class MdaTypes {
        @objid ("2eec63c5-6b6f-448f-ac65-9b1c4ca81656")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("42d9ef4e-17b9-4615-8e4f-402a18c3420f")
        private static Stereotype MDAASSOCDEP;

        @objid ("c0d6c7b4-be4c-4154-aaf6-c2496c039f57")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4fc5b5d1-7e41-4cd9-b285-22d08bc342c6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "013ca297-0ccf-11df-8525-001302895b2b");
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
