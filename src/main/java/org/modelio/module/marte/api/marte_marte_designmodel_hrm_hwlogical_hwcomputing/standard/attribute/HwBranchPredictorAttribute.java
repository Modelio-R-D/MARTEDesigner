/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.attribute.HwResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwBranchPredictor_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5821fb1e-7fc8-453e-976c-a0cf08bd445c")
public class HwBranchPredictorAttribute extends HwResourceAttribute {
    @objid ("b44f228a-0561-49f6-b101-67f220b69052")
    public static final String STEREOTYPE_NAME = "HwBranchPredictor_Attribute";

    /**
     * Tells whether a {@link HwBranchPredictorAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwBranchPredictor_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f6949abb-879e-4a4c-aa85-c74f4ea6a96c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwBranchPredictor_Attribute >> then instantiate a {@link HwBranchPredictorAttribute} proxy.
     * 
     * @return a {@link HwBranchPredictorAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("38e8f9f6-1609-43f6-af90-0a2411fb57fd")
    public static HwBranchPredictorAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorAttribute.STEREOTYPE_NAME);
        return HwBranchPredictorAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorAttribute} proxy from a {@link Attribute} stereotyped << HwBranchPredictor_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwBranchPredictorAttribute} proxy or <i>null</i>.
     */
    @objid ("4a49b239-e1d8-4067-ae4f-cab29b4b078b")
    public static HwBranchPredictorAttribute instantiate(final Attribute obj) {
        return HwBranchPredictorAttribute.canInstantiate(obj) ? new HwBranchPredictorAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorAttribute} proxy from a {@link Attribute} stereotyped << HwBranchPredictor_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwBranchPredictorAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e88f8f69-7dc9-4618-95dc-1fd8093d49f4")
    public static HwBranchPredictorAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwBranchPredictorAttribute.canInstantiate(obj))
        	return new HwBranchPredictorAttribute(obj);
        else
        	throw new IllegalArgumentException("HwBranchPredictorAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("53f3afb4-e6d7-4bac-93ec-a79c8a040641")
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
        HwBranchPredictorAttribute other = (HwBranchPredictorAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("513b1bd0-a730-48d3-9e2c-a4b86b4a7426")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    @objid ("9248d5e3-2221-46dd-a12d-4d13621a5f85")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("bea6821e-46b4-4855-b792-68d4f49f1794")
    protected HwBranchPredictorAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("73adf86e-2777-4876-9bf9-85c1675a0265")
    public static final class MdaTypes {
        @objid ("87ca7f5b-39dc-473c-95dd-aa23784e6115")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9fba1a07-a436-43e2-a0da-615a0cd21fa7")
        private static Stereotype MDAASSOCDEP;

        @objid ("3a26f423-3b68-4d81-921a-a74facf5f1ab")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("76513cdc-ec69-42f7-9ba1-c7c97de714f0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00fc43f3-0ccf-11df-8525-001302895b2b");
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
