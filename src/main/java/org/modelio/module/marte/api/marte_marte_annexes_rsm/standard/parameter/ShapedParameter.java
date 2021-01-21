/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("74c15795-61fc-42b2-bf20-590a7dd6b8ff")
    public static final String STEREOTYPE_NAME = "Shaped_Parameter";

    @objid ("43a6152f-3d65-4313-b834-066cbb7a6198")
    public static final String SHAPED_PARAMETER_SHAPE_TAGTYPE = "Shaped_Parameter_shape";

    /**
     * The underlying {@link Parameter} represented by this proxy, never null.
     */
    @objid ("321a1fd4-0f69-4a6c-9730-2f444c4ea037")
    protected final Parameter elt;

    /**
     * Tells whether a {@link ShapedParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << Shaped_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f444fa06-2d8b-44de-b3a9-03a071ffe214")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ShapedParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << Shaped_Parameter >> then instantiate a {@link ShapedParameter} proxy.
     * 
     * @return a {@link ShapedParameter} proxy on the created {@link Parameter}.
     */
    @objid ("1dbc1f07-3968-4ec3-a341-ca3b9d07f627")
    public static ShapedParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ShapedParameter.STEREOTYPE_NAME);
        return ShapedParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link ShapedParameter} proxy from a {@link Parameter} stereotyped << Shaped_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link ShapedParameter} proxy or <i>null</i>.
     */
    @objid ("41b5206e-2bbb-46fd-98a3-5d5f50f358c8")
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
    @objid ("194bf3c3-3a2a-48b2-b033-df4d4a7b82db")
    public static ShapedParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (ShapedParameter.canInstantiate(obj))
        	return new ShapedParameter(obj);
        else
        	throw new IllegalArgumentException("ShapedParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9b28ba5d-838b-40ab-9854-d6aedba7eb23")
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
    @objid ("c30aa2fb-5b91-415c-a643-e03c2921c7e8")
    public Parameter getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Shaped_Parameter_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6886f026-93d8-4c13-8c7b-21a4db2a21c0")
    public String getShaped_Parameter_shape() {
        return this.elt.getTagValue(ShapedParameter.MdaTypes.SHAPED_PARAMETER_SHAPE_TAGTYPE_ELT);
    }

    @objid ("9265c914-d781-4bad-be0d-dbd5b3945855")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Shaped_Parameter_shape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f41056b6-5521-4e22-b096-7c44dc06b3c0")
    public void setShaped_Parameter_shape(final String value) {
        this.elt.putTagValue(ShapedParameter.MdaTypes.SHAPED_PARAMETER_SHAPE_TAGTYPE_ELT, value);
    }

    @objid ("64d05e0c-f7f2-4b5a-b187-2eafe1e49ba6")
    protected ShapedParameter(final Parameter elt) {
        this.elt = elt;
    }

    @objid ("5e3c1289-db17-4916-8f51-7e49376bc192")
    public static final class MdaTypes {
        @objid ("7f681bda-c429-4731-bae4-1f0eb40d300d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("78506201-e1f0-4030-9e82-a4a92529b669")
        public static TagType SHAPED_PARAMETER_SHAPE_TAGTYPE_ELT;

        @objid ("87777ec4-971e-45fe-b8e9-8339d6a7ffdf")
        private static Stereotype MDAASSOCDEP;

        @objid ("a1782b70-bd20-4a43-bb83-cac3bf519974")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a78889ba-3da3-4b78-9a13-b2bafe77f27c")
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
