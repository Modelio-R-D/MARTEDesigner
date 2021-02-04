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
 * Proxy class to handle a {@link AssociationEnd} with << HwArbiter_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("78302229-07f7-464c-9198-ec5fe47e2707")
public class HwArbiterAssociationEnd extends HwCommunicationResourceAssociationEnd {
    @objid ("ad605ba1-5d03-4537-9714-07319ba37806")
    public static final String STEREOTYPE_NAME = "HwArbiter_AssociationEnd";

    @objid ("b87f5413-c934-43fb-ad1b-d01cc47c95f6")
    public static final String HWARBITER_ASSOCIATIONEND_CONTROLLEDMEDIAS_TAGTYPE = "HwArbiter_AssociationEnd_controlledMedias";

    /**
     * Tells whether a {@link HwArbiterAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwArbiter_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3ec7a42f-6b73-4960-bbee-e4a1c1f3c0a4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwArbiter_AssociationEnd >> then instantiate a {@link HwArbiterAssociationEnd} proxy.
     * 
     * @return a {@link HwArbiterAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("5c84e7ce-b0e2-49b8-8685-b6d73b54e24b")
    public static HwArbiterAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterAssociationEnd.STEREOTYPE_NAME);
        return HwArbiterAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwArbiterAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwArbiter_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwArbiterAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("51c246fa-b0f1-4452-9240-73702443133c")
    public static HwArbiterAssociationEnd instantiate(final AssociationEnd obj) {
        return HwArbiterAssociationEnd.canInstantiate(obj) ? new HwArbiterAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwArbiterAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwArbiter_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwArbiterAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4dc6c156-e6ee-4aa6-a8f1-2795abb7602b")
    public static HwArbiterAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwArbiterAssociationEnd.canInstantiate(obj))
        	return new HwArbiterAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwArbiterAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("36a8786e-6ec7-4138-a32f-b0097c060d8a")
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
        HwArbiterAssociationEnd other = (HwArbiterAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("671c3c54-f5a7-42e8-a292-c577cc666c6e")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwArbiter_AssociationEnd_controlledMedias'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("982875a4-3914-414e-b629-ea5a98f426d5")
    public List<String> getHwArbiter_AssociationEnd_controlledMedias() {
        return this.elt.getTagValues(HwArbiterAssociationEnd.MdaTypes.HWARBITER_ASSOCIATIONEND_CONTROLLEDMEDIAS_TAGTYPE_ELT);
    }

    @objid ("ce386ab0-1a0d-4058-9158-c027833cd5fe")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwArbiter_AssociationEnd_controlledMedias'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("51d3e063-02a3-4ccc-979b-18778c39d208")
    public void setHwArbiter_AssociationEnd_controlledMedias(final List<String> values) {
        this.elt.putTagValues(HwArbiterAssociationEnd.MdaTypes.HWARBITER_ASSOCIATIONEND_CONTROLLEDMEDIAS_TAGTYPE_ELT, values);
    }

    @objid ("be3eea23-85dc-46d7-ab43-b370650c1619")
    protected HwArbiterAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("0a8f36ee-8330-44da-98b0-0a236435c4e3")
    public static final class MdaTypes {
        @objid ("2ff57b05-c412-4839-a4c8-1181b6733304")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cceca3f4-dcfc-42c1-a75d-bd2f70337a51")
        public static TagType HWARBITER_ASSOCIATIONEND_CONTROLLEDMEDIAS_TAGTYPE_ELT;

        @objid ("804a9abf-d7c5-4cf1-aba0-c590e892b57e")
        private static Stereotype MDAASSOCDEP;

        @objid ("86778b6e-2237-435e-9105-9b1e7219727c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("11db2d59-643b-4ec1-bcce-0eaf7fa30e59")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01036ae6-0ccf-11df-8525-001302895b2b");
            HWARBITER_ASSOCIATIONEND_CONTROLLEDMEDIAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01036aed-0ccf-11df-8525-001302895b2b");
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
