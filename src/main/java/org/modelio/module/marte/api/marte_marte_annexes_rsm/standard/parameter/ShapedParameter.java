/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << Shaped_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("97e58de5-eb18-44f9-8141-10420c059ae2")
public class ShapedParameter {
    @objid ("6f1278ad-afac-4c60-8575-2231b9ef5e07")
    public static final String STEREOTYPE_NAME = "Shaped_Parameter";

    @objid ("cf00db4f-8781-4e79-92c3-3f690f3bebb3")
    public static final String SHAPED_PARAMETER_SHAPE_TAGTYPE = "Shaped_Parameter_shape";

    /**
     * The underlying {@link Parameter} represented by this proxy, never null.
     */
    @objid ("2b6e994b-76de-46a6-9d4f-76568e26d991")
    protected final Parameter elt;

    /**
     * Tells whether a {@link ShapedParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << Shaped_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e4270425-6c53-47d8-8581-4cf019c94a4c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ShapedParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << Shaped_Parameter >> then instantiate a {@link ShapedParameter} proxy.
     * 
     * @return a {@link ShapedParameter} proxy on the created {@link Parameter}.
     */
    @objid ("fc9e1823-be7d-4f6b-9bb7-3711aa14c6fc")
    public static ShapedParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ShapedParameter.STEREOTYPE_NAME);
        return ShapedParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link ShapedParameter} proxy from a {@link Parameter} stereotyped << Shaped_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link ShapedParameter} proxy or <i>null</i>.
     */
    @objid ("a3ae8a21-73a0-4958-a64c-db2bf761c28e")
    public static ShapedParameter instantiate(final Parameter obj) {
        return ShapedParameter.canInstantiate(obj) ? new ShapedParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ShapedParameter} proxy from a {@link Parameter} stereotyped << Shaped_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link ShapedParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("81768122-3074-4c1d-8f2f-5fdefa7e1e25")
    public static ShapedParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (ShapedParameter.canInstantiate(obj))
        	return new ShapedParameter(obj);
        else
        	throw new IllegalArgumentException("ShapedParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("14352d36-e834-40dd-935c-7d47574c4060")
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
        ShapedParameter other = (ShapedParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("d4d71dd6-4605-4c12-9d04-6387de951019")
    public Parameter getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Shaped_Parameter_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9a4c264c-15f3-44de-b1b2-caaab2e1de54")
    public String getShaped_Parameter_shape() {
        return this.elt.getTagValue(ShapedParameter.MdaTypes.SHAPED_PARAMETER_SHAPE_TAGTYPE_ELT);
    }

    @objid ("a6bd5fee-d5e3-41fc-92e4-29adb3470be9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Shaped_Parameter_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3a14fdb8-ccdb-43e0-a7bf-69b8e7b70333")
    public void setShaped_Parameter_shape(final String value) {
        this.elt.putTagValue(ShapedParameter.MdaTypes.SHAPED_PARAMETER_SHAPE_TAGTYPE_ELT, value);
    }

    @objid ("29f68a78-1f27-4b16-a8f2-f313f81ed954")
    protected ShapedParameter(final Parameter elt) {
        this.elt = elt;
    }

    @objid ("5e3c1289-db17-4916-8f51-7e49376bc192")
    public static final class MdaTypes {
        @objid ("adf92f3a-adfa-4851-ac45-bf45115237e6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8dd7cc65-9905-4d39-9043-78a8809794d4")
        public static TagType SHAPED_PARAMETER_SHAPE_TAGTYPE_ELT;

        @objid ("08c3abe3-a766-4e1f-9514-c751fa9b4cc9")
        private static Stereotype MDAASSOCDEP;

        @objid ("a4ec12b1-428c-48d0-bb98-5db3b3c7438b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2dc36a7f-dd80-4750-b31c-e3f6dfd63790")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0c7f2c71-14b5-11df-9d54-0014222a9f79");
            SHAPED_PARAMETER_SHAPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0c7f2c72-14b5-11df-9d54-0014222a9f79");
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
