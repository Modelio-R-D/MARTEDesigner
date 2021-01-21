/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("26de68ad-c592-46bc-a97e-8f6273afa8a4")
    public static final String STEREOTYPE_NAME = "SaSharedResource_Parameter";

    @objid ("9276ec7f-00e5-49a5-9bb1-e994ad5793c8")
    public static final String SASHAREDRESOURCE_PARAMETER_ACQUIST_TAGTYPE = "SaSharedResource_Parameter_acquisT";

    @objid ("ecb3d244-b85c-46d4-bdd4-5cf22108e8cb")
    public static final String SASHAREDRESOURCE_PARAMETER_CAPACITY_TAGTYPE = "SaSharedResource_Parameter_capacity";

    @objid ("5660f29b-4ccb-4ce7-bcdc-0c99ab617f45")
    public static final String SASHAREDRESOURCE_PARAMETER_ISCONSUM_TAGTYPE = "SaSharedResource_Parameter_isConsum";

    @objid ("9dba6044-7238-460c-a2a5-a4ac79681587")
    public static final String SASHAREDRESOURCE_PARAMETER_ISPREEMP_TAGTYPE = "SaSharedResource_Parameter_isPreemp";

    @objid ("435ddddd-1f32-4050-b029-ad079e176010")
    public static final String SASHAREDRESOURCE_PARAMETER_RELEASET_TAGTYPE = "SaSharedResource_Parameter_releaseT";

    /**
     * Tells whether a {@link SaSharedResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SaSharedResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6cde0c1a-bd57-4295-960e-1e56ad8e7f71")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SaSharedResource_Parameter >> then instantiate a {@link SaSharedResourceParameter} proxy.
     * 
     * @return a {@link SaSharedResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("afc639d9-da0c-44e5-a79e-c5636bfb5720")
    public static SaSharedResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSharedResourceParameter.STEREOTYPE_NAME);
        return SaSharedResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SaSharedResourceParameter} proxy from a {@link Parameter} stereotyped << SaSharedResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SaSharedResourceParameter} proxy or <i>null</i>.
     */
    @objid ("c7b8929e-5397-40fd-b3a2-522cae50fb15")
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
    @objid ("ccedbb09-be9d-4a7d-8811-e6d72fbfde9d")
    public static SaSharedResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SaSharedResourceParameter.canInstantiate(obj))
        	return new SaSharedResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SaSharedResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c7f5f47a-da66-44fd-b5c0-79e25d5e1368")
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
    @objid ("53100168-a557-420f-8c94-9bcd7a50125d")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Parameter_acquisT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("1a4d0a47-6dec-4b3d-969e-3ad608ba590f")
    public List<String> getSaSharedResource_Parameter_acquisT() {
        return this.elt.getTagValues(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ACQUIST_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaSharedResource_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d8171e1b-5fc1-4b00-b2e6-f3720955245f")
    public String getSaSharedResource_Parameter_capacity() {
        return this.elt.getTagValue(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSharedResource_Parameter_releaseT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ec0b1c0c-9073-4777-a021-dcb65d3f5dc1")
    public List<String> getSaSharedResource_Parameter_releaseT() {
        return this.elt.getTagValues(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_RELEASET_TAGTYPE_ELT);
    }

    @objid ("4faa5da6-280d-4575-b198-5ca1362e7d78")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaSharedResource_Parameter_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("54ec0b84-4a41-4880-8dfb-f1c42b1bd259")
    public boolean isSaSharedResource_Parameter_isConsum() {
        return this.elt.isTagged(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ISCONSUM_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaSharedResource_Parameter_isPreemp'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9a483bec-398e-4bf1-b910-1c12d271431f")
    public boolean isSaSharedResource_Parameter_isPreemp() {
        return this.elt.isTagged(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ISPREEMP_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SaSharedResource_Parameter_acquisT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7e12cb4e-dc01-4353-a889-e1f77783df84")
    public void setSaSharedResource_Parameter_acquisT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_ACQUIST_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SaSharedResource_Parameter_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a173df21-f133-48ae-8019-0b6030454256")
    public void setSaSharedResource_Parameter_capacity(final String value) {
        this.elt.putTagValue(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaSharedResource_Parameter_isConsum'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a30d7aeb-314d-4a6f-b14e-7077cff88778")
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
    @objid ("0d19066e-4363-4b28-899c-6da741ec853c")
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
    @objid ("55c3629b-ed3f-48d7-a385-1cfab7b17bdd")
    public void setSaSharedResource_Parameter_releaseT(final List<String> values) {
        this.elt.putTagValues(SaSharedResourceParameter.MdaTypes.SASHAREDRESOURCE_PARAMETER_RELEASET_TAGTYPE_ELT, values);
    }

    @objid ("0c290698-466e-4fa1-84ce-b71cd4ef3820")
    protected SaSharedResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("0a8874e4-4c25-4944-aac5-edc51e951237")
    public static final class MdaTypes {
        @objid ("2646c4d4-0f8e-46c8-8c8f-22d13b452f37")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("da742567-9256-40d2-953b-8a83124c89d4")
        public static TagType SASHAREDRESOURCE_PARAMETER_CAPACITY_TAGTYPE_ELT;

        @objid ("b18051dd-c161-4099-aa6e-f3da505f0b4b")
        public static TagType SASHAREDRESOURCE_PARAMETER_ISPREEMP_TAGTYPE_ELT;

        @objid ("6655a7d3-dde4-4400-ae61-09c0b3deccbe")
        public static TagType SASHAREDRESOURCE_PARAMETER_ISCONSUM_TAGTYPE_ELT;

        @objid ("f8ba5c97-0e16-46a0-9e48-10b60b110af6")
        public static TagType SASHAREDRESOURCE_PARAMETER_ACQUIST_TAGTYPE_ELT;

        @objid ("c13eb796-c95a-4e7e-8178-b4723ae31d44")
        public static TagType SASHAREDRESOURCE_PARAMETER_RELEASET_TAGTYPE_ELT;

        @objid ("b755f663-a53d-45af-8226-7fc44a771f4d")
        private static Stereotype MDAASSOCDEP;

        @objid ("4bf426e5-52d5-4947-8d96-6bb77ad6686f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8f5bc03c-4577-4d1c-83b5-4060923415ce")
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
