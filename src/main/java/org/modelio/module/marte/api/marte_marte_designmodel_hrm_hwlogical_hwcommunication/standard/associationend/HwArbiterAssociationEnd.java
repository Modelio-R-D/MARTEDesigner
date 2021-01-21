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
 * Proxy class to handle a {@link AssociationEnd} with << HwArbiter_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("78302229-07f7-464c-9198-ec5fe47e2707")
public class HwArbiterAssociationEnd extends HwCommunicationResourceAssociationEnd {
    @objid ("a0eb7813-d4d8-4437-9284-c490c17789e0")
    public static final String STEREOTYPE_NAME = "HwArbiter_AssociationEnd";

    @objid ("fbd18d8b-69f2-4da6-9324-dabff15d55a4")
    public static final String HWARBITER_ASSOCIATIONEND_CONTROLLEDMEDIAS_TAGTYPE = "HwArbiter_AssociationEnd_controlledMedias";

    /**
     * Tells whether a {@link HwArbiterAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwArbiter_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("51f0b692-b108-4f54-9fd7-664808c3d6d8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwArbiter_AssociationEnd >> then instantiate a {@link HwArbiterAssociationEnd} proxy.
     * 
     * @return a {@link HwArbiterAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("989af88c-3455-4ce4-88e8-1ee300912507")
    public static HwArbiterAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwArbiterAssociationEnd.STEREOTYPE_NAME);
        return HwArbiterAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwArbiterAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwArbiter_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwArbiterAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("b90add2e-220c-4f17-92c2-32071c8d4776")
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
    @objid ("dba775ab-5a95-4dd1-8e5e-e3ae8e59e7b2")
    public static HwArbiterAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwArbiterAssociationEnd.canInstantiate(obj))
        	return new HwArbiterAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwArbiterAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fb871bc0-343d-4d45-ac83-51317f24eaa4")
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
    @objid ("92aa44b6-1122-4dbc-9cad-274b13d80a69")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwArbiter_AssociationEnd_controlledMedias'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d0966127-ce35-4661-a140-6dfcf559fd59")
    public List<String> getHwArbiter_AssociationEnd_controlledMedias() {
        return this.elt.getTagValues(HwArbiterAssociationEnd.MdaTypes.HWARBITER_ASSOCIATIONEND_CONTROLLEDMEDIAS_TAGTYPE_ELT);
    }

    @objid ("d50de109-dee6-4e1b-b82b-023ae1526da4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwArbiter_AssociationEnd_controlledMedias'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e16d6f53-c5fd-403c-b1c7-6ec4f84983cf")
    public void setHwArbiter_AssociationEnd_controlledMedias(final List<String> values) {
        this.elt.putTagValues(HwArbiterAssociationEnd.MdaTypes.HWARBITER_ASSOCIATIONEND_CONTROLLEDMEDIAS_TAGTYPE_ELT, values);
    }

    @objid ("014a7781-d71c-43c0-ac93-e4cdb296d834")
    protected HwArbiterAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("0a8f36ee-8330-44da-98b0-0a236435c4e3")
    public static final class MdaTypes {
        @objid ("b4c0b6a2-8aac-4943-a4f5-64b851df563b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fda93408-0709-44b5-ac5f-2d01b2081c2b")
        public static TagType HWARBITER_ASSOCIATIONEND_CONTROLLEDMEDIAS_TAGTYPE_ELT;

        @objid ("63264285-a99a-4066-8895-88f575654707")
        private static Stereotype MDAASSOCDEP;

        @objid ("2a373e0a-1ed7-4040-9e84-765c9ee8dc19")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2fe8994e-69a7-4a90-a4a6-55708142ead7")
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
