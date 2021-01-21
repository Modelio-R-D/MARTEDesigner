/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_vsl_datatypes.standard.datatype;

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
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << IntervalType_DataType >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("309e2f1b-62e0-44fb-a7cf-633f174113fe")
public class IntervalTypeDataType {
    @objid ("f9937a53-5379-4825-8f2a-a589fb3fe212")
    public static final String STEREOTYPE_NAME = "IntervalType_DataType";

    @objid ("01ff38a0-57e6-48f5-a81f-1de7b1d467e8")
    public static final String INTERVALTYPE_DATATYPE_INTERVALATTRIB_TAGTYPE = "IntervalType_DataType_intervalAttrib";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("93c7921b-291e-4151-8e9b-f3e7efdb43fa")
    protected final DataType elt;

    /**
     * Tells whether a {@link IntervalTypeDataType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << IntervalType_DataType >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("850f68ee-66ff-43dc-aeac-6bd39fd8b432")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, IntervalTypeDataType.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << IntervalType_DataType >> then instantiate a {@link IntervalTypeDataType} proxy.
     * 
     * @return a {@link IntervalTypeDataType} proxy on the created {@link DataType}.
     */
    @objid ("f0627632-574f-4b1f-aad9-bd3b1af4ce08")
    public static IntervalTypeDataType create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("DataType");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, IntervalTypeDataType.STEREOTYPE_NAME);
        return IntervalTypeDataType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link IntervalTypeDataType} proxy from a {@link DataType} stereotyped << IntervalType_DataType >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link IntervalTypeDataType} proxy or <i>null</i>.
     */
    @objid ("a6390f47-89cc-4e98-85e6-03f059ec3599")
    public static IntervalTypeDataType instantiate(final DataType obj) {
        return IntervalTypeDataType.canInstantiate(obj) ? new IntervalTypeDataType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link IntervalTypeDataType} proxy from a {@link DataType} stereotyped << IntervalType_DataType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link IntervalTypeDataType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5ecec4b4-e552-4a9c-891e-d94ca0be8b5b")
    public static IntervalTypeDataType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (IntervalTypeDataType.canInstantiate(obj))
        	return new IntervalTypeDataType(obj);
        else
        	throw new IllegalArgumentException("IntervalTypeDataType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c752e2bf-68a4-4d4a-b40f-46345e6d2045")
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
        IntervalTypeDataType other = (IntervalTypeDataType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("e8866e20-ff0b-4ce2-8f30-599a354bb8de")
    public DataType getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'IntervalType_DataType_intervalAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d5441fc5-4832-4089-88fc-54af9afe6ffb")
    public String getIntervalType_DataType_intervalAttrib() {
        return this.elt.getTagValue(IntervalTypeDataType.MdaTypes.INTERVALTYPE_DATATYPE_INTERVALATTRIB_TAGTYPE_ELT);
    }

    @objid ("82ae91d6-8798-464d-a5e3-9c4067335d43")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'IntervalType_DataType_intervalAttrib'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("82047d30-9d52-4ae9-ba79-5c167b4b4990")
    public void setIntervalType_DataType_intervalAttrib(final String value) {
        this.elt.putTagValue(IntervalTypeDataType.MdaTypes.INTERVALTYPE_DATATYPE_INTERVALATTRIB_TAGTYPE_ELT, value);
    }

    @objid ("eeb6d5e9-a905-406c-9fc2-702a112106e5")
    protected IntervalTypeDataType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("fd83c16a-7c80-4d14-a50c-5ace995ccd69")
    public static final class MdaTypes {
        @objid ("11adfbab-8b58-4496-b79d-e4062b455b1b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("125d2de4-dd68-4265-9611-63849c47bc71")
        public static TagType INTERVALTYPE_DATATYPE_INTERVALATTRIB_TAGTYPE_ELT;

        @objid ("b8622088-e04b-46fc-a41b-5279fbd93936")
        private static Stereotype MDAASSOCDEP;

        @objid ("1fa24ba3-1d40-4333-8adc-b250f0dd12ed")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("705a673a-2fab-4d77-8dff-8c0d7c5e28e3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9ed80a9-0cce-11df-8525-001302895b2b");
            INTERVALTYPE_DATATYPE_INTERVALATTRIB_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d9ed80ad-0cce-11df-8525-001302895b2b");
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
