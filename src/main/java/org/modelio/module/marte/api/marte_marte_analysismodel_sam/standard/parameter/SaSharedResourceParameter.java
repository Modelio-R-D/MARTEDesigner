/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.parameter;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.MutualExclusionResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SaSharedResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("517c0c16-1880-454f-baa3-7198bdbde791")
public class SaSharedResourceParameter extends MutualExclusionResourceParameter {
    @objid ("3740c034-16b8-4c51-a869-358d374be496")
    public static final String STEREOTYPE_NAME = "SaSharedResource_Parameter";

    @objid ("1a746fe2-9656-48bc-864c-e1c7f65fcb62")
    public static final String SASHAREDRESOURCE_PARAMETER_ACQUIST_TAGTYPE = "SaSharedResource_Parameter_acquisT";

    @objid ("d54625c0-f607-450d-9209-5c89efc71eb5")
    public static final String SASHAREDRESOURCE_PARAMETER_CAPACITY_TAGTYPE = "SaSharedResource_Parameter_capacity";

    @objid ("d842a1de-15da-42af-a279-64fb1db45785")
    public static final String SASHAREDRESOURCE_PARAMETER_ISCONSUM_TAGTYPE = "SaSharedResource_Parameter_isConsum";

    @objid ("38ccea8d-e6ee-4fa6-8b97-55043d530b4a")
    public static final String SASHAREDRESOURCE_PARAMETER_ISPREEMP_TAGTYPE = "SaSharedResource_Parameter_isPreemp";

    @objid ("460cbeb3-db96-4412-90d3-96306f3a8375")
    public static final String SASHAREDRESOURCE_PARAMETER_RELEASET_TAGTYPE = "SaSharedResource_Parameter_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SaSharedResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("71afe7e3-ae2a-4bef-a002-f98ae3318c65")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SaSharedResource_Parameter >> then instantiate a {@link SaSharedResourceParameter} proxy.
     * 
     * @return a {@link SaSharedResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("9a5da43c-85ed-4b86-89df-4e9c2e12e6e5")
    public static SaSharedResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceParameter.STEREOTYPE_NAME);
        return SaSharedResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceParameter} proxy from a {@link Parameter} stereotyped << SaSharedResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SaSharedResourceParameter} proxy or <i>null</i>.
     */
    @objid ("f10d9d88-73d5-4a01-9948-bed6e2bc1047")
    public static SaSharedResourceParameter instantiate(final Parameter obj) {
        return SaSharedResourceParameter.canInstantiate(obj) ? new SaSharedResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceParameter} proxy from a {@link Parameter} stereotyped << SaSharedResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SaSharedResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("be24cd1a-bc3b-42f4-875f-7a63499a31ef")
    public static SaSharedResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SaSharedResourceParameter.canInstantiate(obj))
        	return new SaSharedResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8bf9be74-fe67-4256-8040-8479c08ec87e")
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
        SaSharedResourceParameter other = (SaSharedResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("e1356f77-4609-41ae-b72d-e044c00a21db")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Parameter_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d602608e-028c-4cbf-ac2c-6b207bb34b4b")
    public List<String> getSaSharedResource_Parameter_acquisT() {
        return this.elt.getTagValues(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("164654dd-5d1c-4ca8-beac-b0b1ba872471")
    public String getSaSharedResource_Parameter_capacity() {
        return this.elt.getTagValue(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Parameter_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e349596c-fd8a-46ec-8a0d-5eb10fe3e500")
    public List<String> getSaSharedResource_Parameter_releaseT() {
        return this.elt.getTagValues(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_RELEASET_TAGTYPE_ELT);
    }

    @objid ("4f8efe70-1820-4050-8f8a-533ff510e3dc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Parameter_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9155d4af-c767-49bc-871b-d168032285ab")
    public boolean isSaSharedResource_Parameter_isConsum() {
        return this.elt.isTagged(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Parameter_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("91520f19-4683-480a-8888-b9b18a97afaa")
    public boolean isSaSharedResource_Parameter_isPreemp() {
        return this.elt.isTagged(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Parameter_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("951ce5ed-28a7-4254-9e37-4ca13ab8df61")
    public void setSaSharedResource_Parameter_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("33f4a804-517b-4476-b723-3e7c5421d105")
    public void setSaSharedResource_Parameter_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Parameter_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("58687f58-c050-4288-a5b2-550e7e6f0f23")
    public void setSaSharedResource_Parameter_isConsum(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ISCONSUM_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Parameter_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ca091410-927a-477e-8194-8da0e18b7010")
    public void setSaSharedResource_Parameter_isPreemp(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ISPREEMP_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Parameter_releaseT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5dbe152e-1317-4251-b50b-35b0edde1d2d")
    public void setSaSharedResource_Parameter_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_RELEASET_TAGTYPE_ELT, values);
    }

    @objid ("00a69ce5-e8e8-4749-bc19-eedf80aade2a")
    protected SaSharedResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("0a8874e4-4c25-4944-aac5-edc51e951237")
    public static final class MdaTypes {
        @objid ("e9ea2a70-fbb8-4ac3-854c-8ccbafd9f79a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0b33a681-7b10-4dcc-b040-04edab96a382")
        public static TagType SASHAREDRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT;

        @objid ("67bddd86-bdfa-4b0c-8139-53a8959f53b8")
        public static TagType SASHAREDRESOURCE_PARAMETER_ISPREEMP_TAGTYPE_ELT;

        @objid ("ab6d492f-2c5e-44c8-a0d0-a05392f6365b")
        public static TagType SASHAREDRESOURCE_PARAMETER_ISCONSUM_TAGTYPE_ELT;

        @objid ("72d5a5df-88de-4505-bb5e-1ac58a86da59")
        public static TagType SASHAREDRESOURCE_PARAMETER_ACQUIST_TAGTYPE_ELT;

        @objid ("3c5d7de8-0267-4c2a-b27b-046f6bc5cb0f")
        public static TagType SASHAREDRESOURCE_PARAMETER_RELEASET_TAGTYPE_ELT;

        @objid ("a1b536bb-4798-4ae8-87ec-a425c49eccd2")
        private static Stereotype MDAASSOCDEP;

        @objid ("7f741861-8ca8-4e08-a56a-c3e3d17df2d6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f73f490d-6dc8-4ead-8f5a-85f683776c07")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03956b4e-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b55-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_PARAMETER_ISPREEMP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b5c-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_PARAMETER_ISCONSUM_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03956b63-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_PARAMETER_ACQUIST_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0397cda3-0ccf-11df-8525-001302895b2b");
            SASHAREDRESOURCE_PARAMETER_RELEASET_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0397cdaa-0ccf-11df-8525-001302895b2b");
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
