/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link AssociationEnd} with << HwBridge_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("61d467bd-bd76-49a6-b217-c5edc4eed246")
public class HwBridgeAssociationEnd extends HwMediaAssociationEnd {
    @objid ("20be49e1-ea89-43b0-bb40-a6b4c1dfae24")
    public static final String STEREOTYPE_NAME = "HwBridge_AssociationEnd";

    @objid ("d87de35e-9950-464b-8bd8-cd2a0db8153c")
    public static final String HWBRIDGE_ASSOCIATIONEND_SIDES_TAGTYPE = "HwBridge_AssociationEnd_sides";

    /**
     * Tells whether a {@link HwBridgeAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwBridge_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("625b7f78-8838-44b3-8695-d11ba3787320")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwBridge_AssociationEnd >> then instantiate a {@link HwBridgeAssociationEnd} proxy.
     * 
     * @return a {@link HwBridgeAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("47cbf6c9-e5ba-4b3c-8bbb-03be20bba68d")
    public static HwBridgeAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeAssociationEnd.STEREOTYPE_NAME);
        return HwBridgeAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwBridgeAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBridge_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwBridgeAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("7e0f2f02-4835-4235-b219-581eca94f437")
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
    @objid ("3fafa3a7-c5c2-4094-80de-ec0d52702c67")
    public static HwBridgeAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwBridgeAssociationEnd.canInstantiate(obj))
        	return new HwBridgeAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwBridgeAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("19d27096-7e78-48aa-8c12-e7c6dc3b01f2")
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
    @objid ("ae16b9f2-49c7-4ecd-8fc4-c027f72deee0")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwBridge_AssociationEnd_sides'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("016f71d2-6911-485a-855f-3c6e849ea49d")
    public List<String> getHwBridge_AssociationEnd_sides() {
        return this.elt.getTagValues(HwBridgeAssociationEnd.MdaTypes.HWBRIDGE_ASSOCIATIONEND_SIDES_TAGTYPE_ELT);
    }

    @objid ("6659acfb-1058-4342-a877-2f79b1d0f4ec")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwBridge_AssociationEnd_sides'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9547563a-ce88-4e37-b5e8-b976753669c3")
    public void setHwBridge_AssociationEnd_sides(final List<String> values) {
        this.elt.putTagValues(HwBridgeAssociationEnd.MdaTypes.HWBRIDGE_ASSOCIATIONEND_SIDES_TAGTYPE_ELT, values);
    }

    @objid ("b5d639c6-1ced-4c3b-a91d-8513f125306f")
    protected HwBridgeAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("513b5164-5600-4481-a9e6-c1187fab91f4")
    public static final class MdaTypes {
        @objid ("59479c6c-b7ed-4466-ac2b-2c7f43211378")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2886d67f-d2ee-4b28-8d80-c0f7461b95d7")
        public static TagType HWBRIDGE_ASSOCIATIONEND_SIDES_TAGTYPE_ELT;

        @objid ("a55dab47-5b3b-4ff8-81c1-639f8b1656a5")
        private static Stereotype MDAASSOCDEP;

        @objid ("259bc89b-5738-48b1-a48e-28137236724c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("916ea14f-7feb-4b41-99a0-fdaba8559164")
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
