/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.behaviorparameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.parameter.GaExecHostParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link BehaviorParameter} with << SaExecHost_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2c335022-635a-495b-be6f-2b5ae04a901a")
public class SaExecHostParameter extends GaExecHostParameter {
    @objid ("9583270c-13ac-4590-b9a8-73f86e98789d")
    public static final String STEREOTYPE_NAME = "SaExecHost_Parameter";

    @objid ("52e1fe1b-6f33-4307-b881-9a3f5ea052d9")
    public static final String SAEXECHOST_PARAMETER_ISRPRIORANGE_TAGTYPE = "SaExecHost_Parameter_ISRprioRange";

    @objid ("72e2ca76-0103-4368-b2b0-db8d36ab268f")
    public static final String SAEXECHOST_PARAMETER_ISRSWITCHT_TAGTYPE = "SaExecHost_Parameter_ISRswitchT";

    @objid ("ac57e15b-4e9e-4a32-acc0-22fa6bc5bd38")
    public static final String SAEXECHOST_PARAMETER_ISSCHED_TAGTYPE = "SaExecHost_Parameter_isSched";

    @objid ("e7013f9e-68c2-42c1-afb3-9996e5734c58")
    public static final String SAEXECHOST_PARAMETER_SCHSLACK_TAGTYPE = "SaExecHost_Parameter_schSlack";

    @objid ("9714771a-f2cb-4e8a-bd9a-91a8d3148535")
    public static final String SAEXECHOST_PARAMETER_SCHEDUTILIZ_TAGTYPE = "SaExecHost_Parameter_schedUtiliz";

    /**
     * Tells whether a {@link SaExecHostParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link BehaviorParameter} stereotyped << SaExecHost_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6c887c7f-ee27-4f25-a93a-911405b7ba05")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BehaviorParameter) && ((BehaviorParameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BehaviorParameter} stereotyped << SaExecHost_Parameter >> then instantiate a {@link SaExecHostParameter} proxy.
     * 
     * @return a {@link SaExecHostParameter} proxy on the created {@link BehaviorParameter}.
     */
    @objid ("fbd59e41-2d06-42b5-8c08-f8ec34796edd")
    public static SaExecHostParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("BehaviorParameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostParameter.STEREOTYPE_NAME);
        return SaExecHostParameter.instantiate((BehaviorParameter)e);
    }

    /**
     * Tries to instantiate a {@link SaExecHostParameter} proxy from a {@link BehaviorParameter} stereotyped << SaExecHost_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a BehaviorParameter
     * @return a {@link SaExecHostParameter} proxy or <i>null</i>.
     */
    @objid ("21968a6a-d82e-4f3d-8a74-d386d93a644c")
    public static SaExecHostParameter instantiate(final BehaviorParameter obj) {
        return SaExecHostParameter.canInstantiate(obj) ? new SaExecHostParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaExecHostParameter} proxy from a {@link BehaviorParameter} stereotyped << SaExecHost_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link BehaviorParameter}
     * @return a {@link SaExecHostParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9c1e6a83-f1cd-4b70-b634-78f6ad60aa7e")
    public static SaExecHostParameter safeInstantiate(final BehaviorParameter obj) throws IllegalArgumentException {
        if (SaExecHostParameter.canInstantiate(obj))
        	return new SaExecHostParameter(obj);
        else
        	throw new IllegalArgumentException("SaExecHostParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6044788d-32bb-4f49-a9c4-cbc750d1f24a")
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
        SaExecHostParameter other = (SaExecHostParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link BehaviorParameter}. 
     * @return the BehaviorParameter represented by this proxy, never null.
     */
    @objid ("f145f8d7-2d32-4c9c-a09d-15b8e458e6f9")
    @Override
    public BehaviorParameter getElement() {
        return (BehaviorParameter)super.getElement();
    }

    /**
     * Getter for string property 'SaExecHost_Parameter_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9041fa57-6be1-41e3-80ca-39b61ee7c344")
    public String getSaExecHost_Parameter_ISRprioRange() {
        return this.elt.getTagValue(SaExecHostParameter.MdaTypes.SAEXECHOST_PARAMETER_ISRPRIORANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Parameter_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("28652473-0932-482d-ba16-a0ff39219284")
    public String getSaExecHost_Parameter_ISRswitchT() {
        return this.elt.getTagValue(SaExecHostParameter.MdaTypes.SAEXECHOST_PARAMETER_ISRSWITCHT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Parameter_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("15754959-6f9a-4031-98e4-0fd9683a1cd2")
    public String getSaExecHost_Parameter_schSlack() {
        return this.elt.getTagValue(SaExecHostParameter.MdaTypes.SAEXECHOST_PARAMETER_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Parameter_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c80cc50-972e-4f29-935d-de4e5073818f")
    public String getSaExecHost_Parameter_schedUtiliz() {
        return this.elt.getTagValue(SaExecHostParameter.MdaTypes.SAEXECHOST_PARAMETER_SCHEDUTILIZ_TAGTYPE_ELT);
    }

    @objid ("efb928fe-a161-4634-92cd-06eafcbeb3f5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaExecHost_Parameter_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("80ffdc95-fec5-447e-b570-811a7f76e3ad")
    public boolean isSaExecHost_Parameter_isSched() {
        return this.elt.isTagged(SaExecHostParameter.MdaTypes.SAEXECHOST_PARAMETER_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Parameter_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("48d9fe17-2e12-4250-b036-9c838b653f77")
    public void setSaExecHost_Parameter_ISRprioRange(final String value) {
        this.elt.putTagValue(SaExecHostParameter.MdaTypes.SAEXECHOST_PARAMETER_ISRPRIORANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Parameter_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c3b68adc-b982-4cd3-9eaf-644642f153ff")
    public void setSaExecHost_Parameter_ISRswitchT(final String value) {
        this.elt.putTagValue(SaExecHostParameter.MdaTypes.SAEXECHOST_PARAMETER_ISRSWITCHT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaExecHost_Parameter_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a32ea738-21ec-4cf1-b883-7e4b4b15dc1f")
    public void setSaExecHost_Parameter_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaExecHostParameter.MdaTypes.SAEXECHOST_PARAMETER_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaExecHostParameter.MdaTypes.SAEXECHOST_PARAMETER_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Parameter_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a6344093-6883-4681-8371-ce25538f2db3")
    public void setSaExecHost_Parameter_schSlack(final String value) {
        this.elt.putTagValue(SaExecHostParameter.MdaTypes.SAEXECHOST_PARAMETER_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Parameter_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3e23ae4f-393b-4b2b-8c22-22926513fd2a")
    public void setSaExecHost_Parameter_schedUtiliz(final String value) {
        this.elt.putTagValue(SaExecHostParameter.MdaTypes.SAEXECHOST_PARAMETER_SCHEDUTILIZ_TAGTYPE_ELT, value);
    }

    @objid ("e3827bcf-d740-42a2-b06a-456096a58623")
    protected SaExecHostParameter(final BehaviorParameter elt) {
        super(elt);
    }

    @objid ("89f55ad6-f52f-4b67-ae5c-d86c885d3118")
    public static final class MdaTypes {
        @objid ("f84b44ca-bdd5-4506-a25f-1edf1a3ab09a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fdce63e2-e0d9-4e24-aaee-71ac5e830133")
        public static TagType SAEXECHOST_PARAMETER_ISSCHED_TAGTYPE_ELT;

        @objid ("ed98f904-03c5-4641-b5c5-3a4fc742e039")
        public static TagType SAEXECHOST_PARAMETER_SCHSLACK_TAGTYPE_ELT;

        @objid ("05acfec8-78be-4303-92d9-5af8a8efff04")
        public static TagType SAEXECHOST_PARAMETER_SCHEDUTILIZ_TAGTYPE_ELT;

        @objid ("34792599-b28f-44ca-b804-69083c24ec7b")
        public static TagType SAEXECHOST_PARAMETER_ISRSWITCHT_TAGTYPE_ELT;

        @objid ("01a80eae-cf48-4b4a-ad00-99612488c983")
        public static TagType SAEXECHOST_PARAMETER_ISRPRIORANGE_TAGTYPE_ELT;

        @objid ("0a219c7e-dbe5-420f-8cd6-3d491821cf63")
        private static Stereotype MDAASSOCDEP;

        @objid ("22d369fa-36ef-42d7-856c-72902070b4ef")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1dfebd34-136b-4ebb-8342-bfba35f584e9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f83c18c8-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_PARAMETER_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f83c18c9-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_PARAMETER_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f83c18ca-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_PARAMETER_SCHEDUTILIZ_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f83c18cb-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_PARAMETER_ISRSWITCHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f83c18cc-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_PARAMETER_ISRPRIORANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f83c18cd-14ad-11df-9d54-0014222a9f79");
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
