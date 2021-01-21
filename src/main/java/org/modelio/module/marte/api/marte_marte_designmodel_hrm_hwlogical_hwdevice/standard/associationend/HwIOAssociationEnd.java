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
 * Proxy class to handle a {@link AssociationEnd} with << HwI_O_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("996aa924-5c66-4986-b895-5ca59407d331")
public class HwIOAssociationEnd extends HwDeviceAssociationEnd {
    @objid ("3dfe66d0-3e94-4242-b672-446c92e31588")
    public static final String STEREOTYPE_NAME = "HwI_O_AssociationEnd";

    /**
     * Tells whether a {@link HwIOAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwI_O_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("dde7631a-4fe5-4161-a9dc-6162cb33a5d9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwIOAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwI_O_AssociationEnd >> then instantiate a {@link HwIOAssociationEnd} proxy.
     * 
     * @return a {@link HwIOAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("e8ae98d1-115f-4477-861d-7f3772d257b6")
    public static HwIOAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwIOAssociationEnd.STEREOTYPE_NAME);
        return HwIOAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwIOAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwI_O_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwIOAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("785b20f2-239b-44d1-ad64-0f21ac9a1b23")
    public static HwIOAssociationEnd instantiate(final AssociationEnd obj) {
        return HwIOAssociationEnd.canInstantiate(obj) ? new HwIOAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwIOAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwI_O_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwIOAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c7f7cc33-78e6-4647-bcb6-bdb725c67a5e")
    public static HwIOAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwIOAssociationEnd.canInstantiate(obj))
        	return new HwIOAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwIOAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e6bbcd1d-4e86-49a7-a647-697688b9a3f8")
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
        HwIOAssociationEnd other = (HwIOAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("6b5c4289-1fa7-4e19-9276-e9248d0af356")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("9d92dadb-bf53-4fa0-9224-090a7974367e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fa59f6bb-19bb-4ea2-bb11-d004ce58ade3")
    protected HwIOAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("521c2855-04e3-4ea9-a8b3-5457e37616ba")
    public static final class MdaTypes {
        @objid ("dbefd18f-ebec-41c7-89e4-c2ce6751006f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eff6375b-c987-426a-a4aa-345b71e4229c")
        private static Stereotype MDAASSOCDEP;

        @objid ("aa6a566c-974d-4eb2-97a2-5a7c4e7046be")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d3cbdab2-8d9d-4d3c-a6b2-521c54cfb869")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0137ddf3-0ccf-11df-8525-001302895b2b");
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
