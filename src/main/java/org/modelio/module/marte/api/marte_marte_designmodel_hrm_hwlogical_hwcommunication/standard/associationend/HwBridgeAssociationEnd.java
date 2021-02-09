/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link AssociationEnd} with << HwBridge_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwBridgeAssociationEnd extends HwMediaAssociationEnd {
    public static final String STEREOTYPE_NAME = "HwBridge_AssociationEnd";

    public static final String HWBRIDGE_ASSOCIATIONEND_SIDES_TAGTYPE = "HwBridge_AssociationEnd_sides";

    /**
     * Tells whether a {@link HwBridgeAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwBridge_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwBridge_AssociationEnd >> then instantiate a {@link HwBridgeAssociationEnd} proxy.
     * 
     * @return a {@link HwBridgeAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static HwBridgeAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeAssociationEnd.STEREOTYPE_NAME);
        return HwBridgeAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwBridgeAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBridge_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwBridgeAssociationEnd} proxy or <i>null</i>.
     */
    public static HwBridgeAssociationEnd instantiate(final AssociationEnd obj) {
        return HwBridgeAssociationEnd.canInstantiate(obj) ? new HwBridgeAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBridgeAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBridge_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwBridgeAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwBridgeAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwBridgeAssociationEnd.canInstantiate(obj))
        	return new HwBridgeAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwBridgeAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwBridgeAssociationEnd other = (HwBridgeAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwBridge_AssociationEnd_sides'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwBridge_AssociationEnd_sides() {
        return this.elt.getTagValues(HwBridgeAssociationEnd.MdaTypes.HWBRIDGE_ASSOCIATIONEND_SIDES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwBridge_AssociationEnd_sides'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBridge_AssociationEnd_sides(final List<String> values) {
        this.elt.putTagValues(HwBridgeAssociationEnd.MdaTypes.HWBRIDGE_ASSOCIATIONEND_SIDES_TAGTYPE_ELT, values);
    }

    protected HwBridgeAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWBRIDGE_ASSOCIATIONEND_SIDES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "011da46d-0ccf-11df-8525-001302895b2b");
            HWBRIDGE_ASSOCIATIONEND_SIDES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "011da474-0ccf-11df-8525-001302895b2b");
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
