/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.lifeline.GaExecHostLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SaExecHost_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e00f5f0c-fc6e-42b9-95b6-f26230d69c22")
public class SaExecHostLifeline extends GaExecHostLifeline {
    @objid ("0a53198a-a13f-45a7-9956-5aa7a2cf87e5")
    public static final String STEREOTYPE_NAME = "SaExecHost_Lifeline";

    @objid ("3ef88b48-0c85-48b0-9457-405748fa875d")
    public static final String SAEXECHOST_LIFELINE_ISRPRIORANGE_TAGTYPE = "SaExecHost_Lifeline_ISRprioRange";

    @objid ("97789d1e-c5be-4c1e-9299-5a5932bf1304")
    public static final String SAEXECHOST_LIFELINE_ISRSWITCHT_TAGTYPE = "SaExecHost_Lifeline_ISRswitchT";

    @objid ("49e7ff26-79a7-4ba9-8abf-441c1a9e11d1")
    public static final String SAEXECHOST_LIFELINE_ISSCHED_TAGTYPE = "SaExecHost_Lifeline_isSched";

    @objid ("0b2d3f92-4e81-46f6-838b-d6bc315a2ddd")
    public static final String SAEXECHOST_LIFELINE_SCHSLACK_TAGTYPE = "SaExecHost_Lifeline_schSlack";

    @objid ("880a7110-760b-464f-839c-6d562c5c9077")
    public static final String SAEXECHOST_LIFELINE_SCHEDUTILIZ_TAGTYPE = "SaExecHost_Lifeline_schedUtiliz";

    /**
     * Tells whether a {@link SaExecHostLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SaExecHost_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("2b53645a-9935-4738-8e8e-cd73f3edbb38")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SaExecHost_Lifeline >> then instantiate a {@link SaExecHostLifeline} proxy.
     * 
     * @return a {@link SaExecHostLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("6864feb5-a5a2-4410-b502-8b89e18e55d6")
    public static SaExecHostLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostLifeline.STEREOTYPE_NAME);
        return SaExecHostLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SaExecHostLifeline} proxy from a {@link Lifeline} stereotyped << SaExecHost_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SaExecHostLifeline} proxy or <i>null</i>.
     */
    @objid ("871de9f4-8930-417b-987b-d5deef703c7b")
    public static SaExecHostLifeline instantiate(final Lifeline obj) {
        return SaExecHostLifeline.canInstantiate(obj) ? new SaExecHostLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaExecHostLifeline} proxy from a {@link Lifeline} stereotyped << SaExecHost_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SaExecHostLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2d480025-22e2-4f5b-9286-f4ff274cbc7f")
    public static SaExecHostLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SaExecHostLifeline.canInstantiate(obj))
        	return new SaExecHostLifeline(obj);
        else
        	throw new IllegalArgumentException("SaExecHostLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7517c854-9e4c-4a82-888e-ce1db3e89727")
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
        SaExecHostLifeline other = (SaExecHostLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("056de36c-25b1-4b8d-95a0-961e94b45ebd")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'SaExecHost_Lifeline_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8987d58e-4197-4dfa-ba0b-30415ae1d664")
    public String getSaExecHost_Lifeline_ISRprioRange() {
        return this.elt.getTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_ISRPRIORANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Lifeline_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("084773fd-df2e-476c-beb7-1ca51f1c30fa")
    public String getSaExecHost_Lifeline_ISRswitchT() {
        return this.elt.getTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_ISRSWITCHT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Lifeline_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2611a700-8232-4eb7-92ea-a0cdf9e2ab46")
    public String getSaExecHost_Lifeline_schSlack() {
        return this.elt.getTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Lifeline_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b4bf0f2e-4888-4952-b959-4e80c44fd173")
    public String getSaExecHost_Lifeline_schedUtiliz() {
        return this.elt.getTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_SCHEDUTILIZ_TAGTYPE_ELT);
    }

    @objid ("7fdd5688-a6f4-4a59-b8bc-4f3969ad8ad9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaExecHost_Lifeline_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9ba60a8e-29a2-4ee2-a86e-2da2d738b765")
    public boolean isSaExecHost_Lifeline_isSched() {
        return this.elt.isTagged(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Lifeline_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("21552fc1-ae9b-4f71-b326-ad4e06fe7907")
    public void setSaExecHost_Lifeline_ISRprioRange(final String value) {
        this.elt.putTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_ISRPRIORANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Lifeline_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("51120b61-3424-48f4-935d-ba9451821a16")
    public void setSaExecHost_Lifeline_ISRswitchT(final String value) {
        this.elt.putTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_ISRSWITCHT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaExecHost_Lifeline_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aca9f3ec-5eca-497d-a80f-5faab16de31e")
    public void setSaExecHost_Lifeline_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Lifeline_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d61f5246-0df3-436d-828d-b7b2729b26e7")
    public void setSaExecHost_Lifeline_schSlack(final String value) {
        this.elt.putTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Lifeline_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c75ef5da-3ba5-4b1b-9496-964c9046f256")
    public void setSaExecHost_Lifeline_schedUtiliz(final String value) {
        this.elt.putTagValue(SaExecHostLifeline.MdaTypes.SAEXECHOST_LIFELINE_SCHEDUTILIZ_TAGTYPE_ELT, value);
    }

    @objid ("b86750de-8971-491a-88b8-ac80c1f6066a")
    protected SaExecHostLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("1e54b74b-4b59-481e-9789-c2c5a436d364")
    public static final class MdaTypes {
        @objid ("9f39cec6-58cd-44fb-a849-6acd07f56e7f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("abbe510e-cd39-4468-9875-e9779178932e")
        public static TagType SAEXECHOST_LIFELINE_ISSCHED_TAGTYPE_ELT;

        @objid ("6014f01b-df12-457b-b6ba-421c7e97fe08")
        public static TagType SAEXECHOST_LIFELINE_SCHSLACK_TAGTYPE_ELT;

        @objid ("62b92c38-fcad-4ec0-974a-2edfa30e4fc9")
        public static TagType SAEXECHOST_LIFELINE_SCHEDUTILIZ_TAGTYPE_ELT;

        @objid ("112519d5-752e-4bfb-a021-264a8168a225")
        public static TagType SAEXECHOST_LIFELINE_ISRSWITCHT_TAGTYPE_ELT;

        @objid ("f4cbb346-ef4c-44da-bf0d-86030fcdad2b")
        public static TagType SAEXECHOST_LIFELINE_ISRPRIORANGE_TAGTYPE_ELT;

        @objid ("45153dd3-a4f8-4da5-bcbb-3a784679f1c0")
        private static Stereotype MDAASSOCDEP;

        @objid ("f597dc94-3def-4567-b670-04ef5a2d7878")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f0d08084-1c3c-4f43-88f6-196393099988")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f87a163a-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_LIFELINE_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f87a163b-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_LIFELINE_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f87a163c-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_LIFELINE_SCHEDUTILIZ_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f87a163d-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_LIFELINE_ISRSWITCHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f87a163e-14ad-11df-9d54-0014222a9f79");
            SAEXECHOST_LIFELINE_ISRPRIORANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f87a163f-14ad-11df-9d54-0014222a9f79");
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
