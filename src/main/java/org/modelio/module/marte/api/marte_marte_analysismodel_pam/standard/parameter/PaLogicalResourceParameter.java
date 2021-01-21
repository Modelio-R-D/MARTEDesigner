/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.parameter;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.ResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << PaLogicalResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("80fa33d0-4e1c-482f-9206-51afbcef0033")
public class PaLogicalResourceParameter extends ResourceParameter {
    @objid ("981d9d40-f9e9-4e6f-a7e9-ba7d1309a5b5")
    public static final String STEREOTYPE_NAME = "PaLogicalResource_Parameter";

    @objid ("d8c4130b-e1cf-453b-9e37-96b95752e0da")
    public static final String PALOGICALRESOURCE_PARAMETER_POOLSIZE_TAGTYPE = "PaLogicalResource_Parameter_poolSize";

    @objid ("4b2eb892-6e39-4227-b494-43b77c1177b4")
    public static final String PALOGICALRESOURCE_PARAMETER_THROUGHPUT_TAGTYPE = "PaLogicalResource_Parameter_throughput";

    @objid ("e7799b2d-ab25-40b7-9090-69a48c6e1839")
    public static final String PALOGICALRESOURCE_PARAMETER_UTILIZATION_TAGTYPE = "PaLogicalResource_Parameter_utilization";

    /**
     * Tells whether a {@link PaLogicalResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << PaLogicalResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b7612023-3ea5-46b7-ba0a-a63e3ae7c34f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << PaLogicalResource_Parameter >> then instantiate a {@link PaLogicalResourceParameter} proxy.
     * 
     * @return a {@link PaLogicalResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("727ab68e-3ff7-4b16-923a-841a0b188085")
    public static PaLogicalResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceParameter.STEREOTYPE_NAME);
        return PaLogicalResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceParameter} proxy from a {@link Parameter} stereotyped << PaLogicalResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link PaLogicalResourceParameter} proxy or <i>null</i>.
     */
    @objid ("0576cc25-177c-435b-8783-9d0545dd61af")
    public static PaLogicalResourceParameter instantiate(final Parameter obj) {
        return PaLogicalResourceParameter.canInstantiate(obj) ? new PaLogicalResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceParameter} proxy from a {@link Parameter} stereotyped << PaLogicalResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link PaLogicalResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("679a77cb-ddab-420b-a15d-3fbee043f6e4")
    public static PaLogicalResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (PaLogicalResourceParameter.canInstantiate(obj))
        	return new PaLogicalResourceParameter(obj);
        else
        	throw new IllegalArgumentException("PaLogicalResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e337078a-307f-42b4-af63-af061a4ca11f")
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
        PaLogicalResourceParameter other = (PaLogicalResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("7a7855e8-4173-4d84-95a5-323b30be2e4c")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'PaLogicalResource_Parameter_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c193743-e552-48c1-8be9-52b3b8975d37")
    public String getPaLogicalResource_Parameter_poolSize() {
        return this.elt.getTagValue(PaLogicalResourceParameter.MdaTypes.PALOGICALRESOURCE_PARAMETER_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Parameter_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8bddd7aa-3ac0-4b7a-b313-d5190e5e8d54")
    public String getPaLogicalResource_Parameter_throughput() {
        return this.elt.getTagValue(PaLogicalResourceParameter.MdaTypes.PALOGICALRESOURCE_PARAMETER_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Parameter_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("588ed5f6-6799-4607-b4e6-70b9bc630c08")
    public String getPaLogicalResource_Parameter_utilization() {
        return this.elt.getTagValue(PaLogicalResourceParameter.MdaTypes.PALOGICALRESOURCE_PARAMETER_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("37b46830-ca53-4c6f-9ac4-5044ec41ac3f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaLogicalResource_Parameter_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3d2d959e-315a-46f0-bf2b-0c39a113eb1e")
    public void setPaLogicalResource_Parameter_poolSize(final String value) {
        this.elt.putTagValue(PaLogicalResourceParameter.MdaTypes.PALOGICALRESOURCE_PARAMETER_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Parameter_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a2b4d87f-405b-4c9c-92e6-66ebea4ad9d4")
    public void setPaLogicalResource_Parameter_throughput(final String value) {
        this.elt.putTagValue(PaLogicalResourceParameter.MdaTypes.PALOGICALRESOURCE_PARAMETER_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Parameter_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a1556f7-fc0d-4e04-a3cb-9efd234626cb")
    public void setPaLogicalResource_Parameter_utilization(final String value) {
        this.elt.putTagValue(PaLogicalResourceParameter.MdaTypes.PALOGICALRESOURCE_PARAMETER_UTILIZATION_TAGTYPE_ELT, value);
    }

    @objid ("f0cf10ac-ee22-47b6-b5ba-dfbed850219e")
    protected PaLogicalResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("a2628869-540b-44be-85b4-500a1c48f221")
    public static final class MdaTypes {
        @objid ("51202184-6f0d-4d3b-8071-2fceb1bda3b3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6cf98647-8865-4f46-958f-b95d93f3ce1a")
        public static TagType PALOGICALRESOURCE_PARAMETER_UTILIZATION_TAGTYPE_ELT;

        @objid ("433ce4bc-76cb-4753-8cc7-9d90b464d5b8")
        public static TagType PALOGICALRESOURCE_PARAMETER_THROUGHPUT_TAGTYPE_ELT;

        @objid ("0dae9df6-d3a6-4fd9-add9-dd4cd87baf54")
        public static TagType PALOGICALRESOURCE_PARAMETER_POOLSIZE_TAGTYPE_ELT;

        @objid ("992ae278-4ca7-44aa-a8b1-044d6824091d")
        private static Stereotype MDAASSOCDEP;

        @objid ("23f89d4e-ac54-4b7b-b3fb-be6e85abef2c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("68e5018f-958b-423a-bd03-32adb368b293")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d10558-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_PARAMETER_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d1055f-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_PARAMETER_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367a5-0ccf-11df-8525-001302895b2b");
            PALOGICALRESOURCE_PARAMETER_POOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367ac-0ccf-11df-8525-001302895b2b");
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
