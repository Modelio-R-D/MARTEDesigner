/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << CommunicationMedia_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f4f00a7a-3ec5-452c-8cbe-b8d55f1048bb")
public class CommunicationMediaParameter extends ProcessingResourceParameter {
    @objid ("27c039df-e930-432e-8f36-2e6550cc1ac1")
    public static final String STEREOTYPE_NAME = "CommunicationMedia_Parameter";

    @objid ("ca66301f-02f9-4124-9133-ae5a966df8d8")
    public static final String COMMUNICATIONMEDIA_PARAMETER_BLOCKT_TAGTYPE = "CommunicationMedia_Parameter_blockT";

    @objid ("81d79282-e009-4f83-bcce-00bb3726935a")
    public static final String COMMUNICATIONMEDIA_PARAMETER_CAPACITY_TAGTYPE = "CommunicationMedia_Parameter_capacity";

    @objid ("3adcf1da-9487-46ee-bc5c-72bc5cbc10b8")
    public static final String COMMUNICATIONMEDIA_PARAMETER_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_Parameter_elementSize";

    @objid ("cc7f4ba9-19ba-45c2-8871-7846b96a1c19")
    public static final String COMMUNICATIONMEDIA_PARAMETER_PACKETT_TAGTYPE = "CommunicationMedia_Parameter_packetT";

    @objid ("27b57c1f-4bb7-4ae9-82de-0bf274c0cca1")
    public static final String COMMUNICATIONMEDIA_PARAMETER_TRANSMMODE_TAGTYPE = "CommunicationMedia_Parameter_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << CommunicationMedia_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9860cae2-4767-4bae-8248-51405cc89e70")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << CommunicationMedia_Parameter >> then instantiate a {@link CommunicationMediaParameter} proxy.
     * 
     * @return a {@link CommunicationMediaParameter} proxy on the created {@link Parameter}.
     */
    @objid ("c3355b09-e027-4c17-aa7c-f1cc2f649d13")
    public static CommunicationMediaParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaParameter.STEREOTYPE_NAME);
        return CommunicationMediaParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaParameter} proxy from a {@link Parameter} stereotyped << CommunicationMedia_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link CommunicationMediaParameter} proxy or <i>null</i>.
     */
    @objid ("aea54c09-d71a-4a6b-80f5-199cfd7467bd")
    public static CommunicationMediaParameter instantiate(final Parameter obj) {
        return CommunicationMediaParameter.canInstantiate(obj) ? new CommunicationMediaParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaParameter} proxy from a {@link Parameter} stereotyped << CommunicationMedia_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link CommunicationMediaParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5106e033-9283-4a27-abe4-dfa4179f29d4")
    public static CommunicationMediaParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (CommunicationMediaParameter.canInstantiate(obj))
        	return new CommunicationMediaParameter(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("346b4b5a-87a5-4eb7-b48b-21e691355320")
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
        CommunicationMediaParameter other = (CommunicationMediaParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Parameter_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a2886b82-9c1f-4d22-b546-da61967a9168")
    public List<String> getCommunicationMedia_Parameter_blockT() {
        return this.elt.getTagValues(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Parameter_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6ef6c3c5-0d1c-4b76-80b9-f55ef4f3edb4")
    public List<String> getCommunicationMedia_Parameter_capacity() {
        return this.elt.getTagValues(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d8e992f6-fd63-43b5-aa67-5343247efa3b")
    public String getCommunicationMedia_Parameter_elementSize() {
        return this.elt.getTagValue(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Parameter_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("28a31901-aec4-4287-9c16-b704676751e0")
    public List<String> getCommunicationMedia_Parameter_packetT() {
        return this.elt.getTagValues(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Parameter_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a53148c2-59ad-4131-ac30-a0ec5309afbd")
    public String getCommunicationMedia_Parameter_transmMode() {
        return this.elt.getTagValue(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("651b0ee4-86e0-49ec-bb60-15d14b32c2c9")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("db72ffd3-c3ef-4bb5-8ad3-e1f502c49cbb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Parameter_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7a91ee8d-e9df-479b-b734-61c8ac49fb3a")
    public void setCommunicationMedia_Parameter_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b146a69e-050b-4fd9-8a0e-29cfc3781c2a")
    public void setCommunicationMedia_Parameter_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Parameter_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("195ed339-2817-4637-bf19-d3a929f6aa15")
    public void setCommunicationMedia_Parameter_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Parameter_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0ff5b2ec-655e-4e43-b70f-ca1f81e466c7")
    public void setCommunicationMedia_Parameter_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Parameter_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("06acd046-235c-44cd-af50-5b66b10622d9")
    public void setCommunicationMedia_Parameter_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaParameter.MdaTypes.COMMUNICATIONMEDIA_PARAMETER_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("1f61808a-fa11-4d05-a463-6da0ef475965")
    protected CommunicationMediaParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("d1892ad9-94b4-4a31-bbd4-631186d5c48a")
    public static final class MdaTypes {
        @objid ("3373b91d-f67e-4f74-a823-53ba387dc592")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("30c4108e-06f7-40cf-a97b-00d234b42327")
        public static TagType COMMUNICATIONMEDIA_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("f98b5729-975d-4aab-8029-5d145644f17f")
        public static TagType COMMUNICATIONMEDIA_PARAMETER_TRANSMMODE_TAGTYPE_ELT;

        @objid ("45e876f5-c18d-4172-8f01-80c7e196a100")
        public static TagType COMMUNICATIONMEDIA_PARAMETER_BLOCKT_TAGTYPE_ELT;

        @objid ("9f03d18e-ecb0-47bd-a905-4842d89ecff9")
        public static TagType COMMUNICATIONMEDIA_PARAMETER_PACKETT_TAGTYPE_ELT;

        @objid ("c1e8d331-1e62-4f84-8564-2cd7de06d701")
        public static TagType COMMUNICATIONMEDIA_PARAMETER_CAPACITY_TAGTYPE_ELT;

        @objid ("93f9024e-b8e5-4266-9b9b-04cf8a0c1843")
        private static Stereotype MDAASSOCDEP;

        @objid ("b2a7c608-5d04-4024-98db-b13c9db1312a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0c56636d-62b0-4115-a8c5-71c2fcffdb2f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "069e7572-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_PARAMETER_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "126b7e2a-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_PARAMETER_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "126b7e2b-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_PARAMETER_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "126b7e2c-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_PARAMETER_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "126b7e2d-0fdd-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_PARAMETER_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "126b7e2e-0fdd-11df-86ac-0014222a9f79");
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
